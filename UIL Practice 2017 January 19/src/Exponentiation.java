import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by uil on 1/19/2017.
 */
public class Exponentiation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("exponentiation.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split("\\s+");
            double a = new Double(line[0]);
            double b = new Double(line[1]);
            double c = new Double(line[0]);
            double d = new Double(line[1]);
            int n = new Integer(line[2]);
            while (n-- > 1) {
                double tempa = a;
                a = a * c - b * d;
                b = tempa * d + b * c;
            }
            System.out.println("(" + a + "," + b + ")");






























            /*String[] line = in.nextLine().split(" ");
            double a = new Double(line[0]);
            double b = new Double(line[1]);
            int exponents = new Integer(line[2]);

            double finA = 0;
            double finB = 0;

            while (exponents-- >= 2) {
                finA = a;
                finB = b;
                a = (finA* finA) - (finB * finB);
                b = (finA * finB) + (finB * finA);
            }

            if (exponents == 1) {
                System.out.println("(" + a + "," + b + ")");
            } else
                System.out.println("(" + a + "," + b + ")");*/
        }
    }
}
