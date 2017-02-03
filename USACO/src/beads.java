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
        int start = (necklaceRead.indexOf('r') < necklaceRead.indexOf('b')) ?
                necklaceRead.indexOf('r') : necklaceRead.indexOf('b');
        int breakk = 0;
        int maxx = 0;
        char temp = necklaceRead.charAt(start);
        for (int i = start; i < counter + counter; i++) {
//            System.out.print(necklace[start]);
//            System.out.print(temp);
            if (necklace[start] == temp || necklace[start] == 'w') {
                max++;
            } else {
                if (max + breakk > maxx) {
                    maxx = max + breakk;
                }
                breakk = max;
                max = 1;
                temp = necklace[start];
            }
//            System.out.println("Max: " + max + "\nBreakk: " + breakk);
            char tmp = necklace[necklace.length - 1];
            for (int j = necklace.length - 1; j > 0; j--) {
                necklace[j] = necklace[j - 1];
            }
            necklace[0] = tmp;
        }
//        System.out.println();
//        System.out.println(necklaceRead);
        out.println(maxx);
        out.close();
    }
}
