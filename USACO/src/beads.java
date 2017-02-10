/*
ID: 18nguye1
LANG: JAVA
PROG: beads
*/

import java.io.*;
import java.util.*;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int counter = new Integer(st.nextToken());
        st = new StringTokenizer(in.readLine());
        String necklaceRead = st.nextToken();
        char[] necklace = necklaceRead.toCharArray();
        int max = 0;
        int start = 1;
        int breakk = 0;
        int maxx = 0;
        char temp = necklaceRead.charAt(start);
        for (int i = start; i < counter + counter + 1; i++) {
//            System.out.print(necklace[start]);
//            System.out.print(temp);
            if (max == necklace.length) {
                maxx = max;
                break;
            }
            if (necklace[start] == temp || necklace[start] == 'w') {
                max++;
            } else {
                if (max + breakk > maxx) {
                    maxx = max + breakk;
                }
                max = 1;
                for (int j = start; j > 0; j--) {
                    max += 1;
                }
//                if (necklace[start - 1] == 'w') {
//                    max = 2;
//                }
                breakk = max;
                temp = necklace[start];
            }
            System.out.println("Max: " + max + "\nBreakk: " + breakk);
            char tmp = necklace[necklace.length - 1];
            for (int j = necklace.length - 1; j > 0; j--) {
                necklace[j] = necklace[j - 1];
            }
            necklace[0] = tmp;
        }
        if (max + breakk > maxx) {
            maxx = max + breakk;
        }
//        System.out.println();
//        System.out.println(necklaceRead);
        out.println(maxx);
        out.close();
    }
}
