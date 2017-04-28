/*
ID: 18nguye1
LANG: JAVA
PROG: 
*/

import java.io.*;
import java.util.*;

public class Prob03 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob03.in.txt"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            TreeSet<Integer> sideLengths = new TreeSet<>();
            int[] sideTest = new int[3];
            String[] line = in.nextLine().split(", ");
            for (String s : line) {
                sideLengths.add(new Integer(s));
            }
            for (int i = 0; i < sideTest.length; i++) {
                sideTest[i] = new Integer(line[i]);
            }
            boolean b = true;
            for (int i = 0; i < sideTest.length; i++) {
                int test = sideTest[i];
                int sum = 0;
                for (int j = 0; j < sideTest.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    sum += sideTest[j];
                }
                if (sum < test) {
                    b = false;
                }
            }
            if (b == false) {
                System.out.println("Not a Triangle");
            } else if (sideLengths.size() == 1) {
                System.out.println("Equilateral");
            } else if (sideLengths.size() == 2) {
                System.out.println("Isosceles");
            } else
                System.out.println("Scalene");
        }
    }
}
