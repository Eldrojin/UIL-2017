/**
 * Created by isenseed on 10/19/2016.
 */
import java.io.*;
import java.util.Scanner;
public class Tiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("tiles.dat"));
        int sets = Integer.parseInt(in.nextLine());
        while(sets-- > 0) {
            String s[] = in.nextLine().split(" ");
            int len = Integer.parseInt(s[0]);
            int wid = Integer.parseInt(s[1]);

            double a = (len*wid) + (len*wid*.1);
            System.out.printf("%d%n", (int)Math.ceil(a));

        }

    }
}
