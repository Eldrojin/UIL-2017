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
                temp += new Integer(copy[i - 1][i - 1]);
                temp += new Integer(copy[i - 1][i]);
                temp += new Integer(copy[i - 1][i + 1]);
                temp += new Integer(copy[i][i - 1]);
                temp += new Integer(copy[i][i]);
                temp += new Integer(copy[i][i + 1]);
                temp += new Integer(copy[i + 1][i - 1]);
                temp += new Integer(copy[i + 1][i]);
                temp += new Integer(copy[i + 1][i + 1]);

                System.out.println(temp);
            }
        }
    }
}
