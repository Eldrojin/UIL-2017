/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Fengge {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("fengge.dat"));

        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            int R = (new Integer(line[0]));
            int C = (new Integer(line[1]));
            String charr = line[2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print(charr);
                }
                System.out.println();
            }
            for (int i = 0; i < R - 4; i++) {
                System.out.print(charr + charr);
                for (int j = 0; j < C - 4; j++) {
                    System.out.print(" ");
                }
                System.out.println(charr + charr);
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print(charr);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
