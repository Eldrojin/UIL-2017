/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class Alphabet {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("alphabet.dat"));
        int sets = new Integer(in.nextLine());
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (sets-- > 0) {
            String line = in.nextLine();
            boolean match = true;
            while (line.length() > 1) {
                String[] test = {"" + line.charAt(0), "" + line.charAt(line.length() - 1)};
                Arrays.sort(test);
                if (!test[1].equals("" + alpha.charAt(alpha.length() - alpha.indexOf(test[0])  - 1)))
                    match = false;
                line = line.substring(1, line.length() - 1);
            }

            System.out.println(match? "YES": "NO");
        }
    }
}
