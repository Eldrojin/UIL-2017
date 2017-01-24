import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 1/23/2017.
 */
public class Exponentiation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("exponentiation.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            double aTmp = new Double(line[0]);
            double a = new Double(line[0]);
            double bTmp = new Double(line[1]);
            double b = new Double(line[1]);
            int exponent = new Integer(line[2]);
            for (int i = 1; i < exponent; i++) {
                double tmp = a;
                a = (a * aTmp) - (b * bTmp);
                b = (tmp * bTmp) + (b * aTmp);
            }
            System.out.println("(" + a + "," + b + ")");
        }
    }
}
