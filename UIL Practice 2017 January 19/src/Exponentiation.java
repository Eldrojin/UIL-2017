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
            double bTmp = new Double(line[1]);
            int exponent = new Integer(line[2]);
            double a = (aTmp * aTmp) - (bTmp * bTmp);
            double b = (aTmp * bTmp) + (bTmp * aTmp);
            for (int i = 2; i < exponent; i++) {
                double store = (a * aTmp) - (b * bTmp);
                b = (aTmp * bTmp) + (bTmp * aTmp);
                a = store;
            }
            System.out.println("(" + a + "," + b + ")");
        }
    }
}
