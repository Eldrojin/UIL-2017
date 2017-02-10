/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

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

            int max = Integer.MIN_VALUE;

            for (int i = 1; i < map.length - 1; i++) {
                int temp = 0;
                String[][] copy = map.clone();
                for (int j = i - 1; j < i + 2; j++) {
                    for (int k = i - 1; k < i + 2; k++) {
                        temp += new Integer(copy[j][k]);
                        copy[j][k] = "0";
                        for (String[] strings : copy) {
                            System.out.println(Arrays.toString(strings));
                        }
                        System.out.println();
                    }
                }

                System.out.println(temp);
            }
        }
    }
}
