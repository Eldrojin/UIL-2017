import java.io.*;
import java.util.*;

public class MandMs {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("mandms.dat"));
        int sets = new Integer(in.nextLine().trim());
        while (sets-- > 0) {
            int mm = new Integer(in.nextLine().trim());
            int count = 0;
            i: while (mm > 0) {
                if (mm == 1 || mm == 2 || mm % 2 == 1)
                    mm--;
                else
                    mm = 2;
                count += 1;
            }
            System.out.println(count);
        }
    }
}
