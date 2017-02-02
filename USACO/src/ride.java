/*
ID: 18nguye1
LANG: JAVA
PROG: ride
*/

import java.io.*;
import java.util.*;

public class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

//        The main alphabet
        HashMap<String, Integer> alphabet = new HashMap<>();

//        Filling up the Hashmap
        for (int i = 65, b = 1; i < 91; i++, b++) {
            alphabet.put("" + (char) i, b);
        }

//        Word Analysis
        String word = st.nextToken();
        st = new StringTokenizer(in.readLine());
        char[] summer = word.toCharArray();
        int sum1 = 1;
        for (char c : summer) {
            sum1 *= alphabet.get("" + c);
        }

        word = st.nextToken();
        summer = word.toCharArray();
        int sum2 = 1;
        for (char c : summer) {
            sum2 *= alphabet.get("" + c);
        }

        out.println((sum1 % 47 == sum2 % 47) ? "GO" : "STAY");
        out.close();
    }
}
