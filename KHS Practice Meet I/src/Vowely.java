/**
 * Created by isenseed on 10/19/2016.
 */
import java.io.*;
import java.util.Scanner;

public class Vowely {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("vowely.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while(sets-- > 0) {
            int v = 0;
            String[] s = in.nextLine().split("");
            for (int i = 0; i < s.length; i++) {
                if(s[i].equals("a") ||s[i].equals("e") || s[i].equals("i") ||s[i].equals("o") ||s[i].equals("u")) {
                    v++;
                }

            }
            if(v >= (s.length+1)/2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
