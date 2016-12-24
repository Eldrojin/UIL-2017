import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by dystr on 12/24/2016.
 */
public class Fujita {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("fujita.dat"));

        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            int base = new Integer(line[1]);
            BigInteger target = new BigInteger(line[0]);
            double log = Math.log(target.doubleValue()) / Math.log(base);
            for (int i = 0; i < (int)(Math.ceil(log)); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
