/*
ID: 18nguye1
LANG: JAVA
PROG: 
*/

import java.io.*;
import java.util.*;

public class Prob02 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob02.in.txt"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String line = in.nextLine();
            int money = (int) (100 * new Double(line.substring(1)));
            System.out.println(line);
            int q = 0, d = 0, n = 0, p = 0;
            while (money > 0) {
                if (money >= 25) {
                    q++;
                    money -= 25;
                } else if (money >= 10) {
                    d++;
                    money -= 10;
                } else if (money >= 5) {
                    n++;
                    money -= 5;
                } else if (money >= 1){
                    p++;
                    money -= 1;
                }
            }
            System.out.printf("Quarters=%d%nDimes=%d%nNickels=%d%nPennies=%d%n", q, d, n, p);
        }
    }
}
