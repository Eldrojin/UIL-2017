/**
 * Created by uil on 2/9/2017.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Probe {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("probe.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            int size = new Integer(in.nextLine());
            String[][] map = new String[size][size];

            for (int i = 0; i < map.length; i++) {
                String[] line = in.nextLine().split(" ");
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = line[j];
                }
            }

            long max = Integer.MIN_VALUE;

            for (int i = 1; i < map.length - 1; i++) {
                long temp = 0;
                String[][] copy = new String[map.length][map.length];
                for (int j = 0; j < copy.length; j++) {
                    for (int k = 0; k < copy[j].length; k++) {
                        copy[j][k] = map[j][k];
                    }
                }
                for (int j = 1; j < map.length - 1; j++) {
                    temp += new Long(copy[i - 1][j - 1]);
                    copy[i - 1][i - 1] = "0";
                    temp += new Long(copy[i - 1][j]);
                    copy[i - 1][i] = "0";
                    temp += new Long(copy[i - 1][j + 1]);
                    copy[i - 1][i + 1] = "0";
                    temp += new Long(copy[i][j - 1]);
                    copy[i][i - 1] = "0";
                    temp += new Long(copy[i][j]);
                    copy[i][i] = "0";
                    temp += new Long(copy[i][j + 1]);
                    copy[i][i + 1] = "0";
                    temp += new Long(copy[i + 1][j - 1]);
                    copy[i + 1][i - 1] = "0";
                    temp += new Long(copy[i + 1][j]);
                    copy[i + 1][i] = "0";
                    temp += new Long(copy[i + 1][j + 1]);
                    copy[i + 1][i + 1] = "0";
                }
                for (int j = 1; j < map[i].length - 1; j++) {
                    for (int k = 1; k < map.length - 1; k++) {
                        long tmp = 0;
                        tmp += new Long(copy[j - 1][k - 1]);
                        tmp += new Long(copy[j - 1][k]);
                        tmp += new Long(copy[j - 1][k + 1]);
                        tmp += new Long(copy[j][k - 1]);
                        tmp += new Long(copy[j][k]);
                        tmp += new Long(copy[j][k + 1]);
                        tmp += new Long(copy[j + 1][k - 1]);
                        tmp += new Long(copy[j + 1][k]);
                        tmp += new Long(copy[j + 1][k + 1]);
                        if (tmp + temp >= max)
                            max = tmp + temp;
                    }
//                    System.out.println("Max: " + max + "\nRow" + i);
                }
            }
            System.out.println(max);
        }
    }
}
