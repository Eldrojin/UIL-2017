import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/9/2016.
 */
public class Christmas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("christmas.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            int toyWant = new Integer(in.nextLine());
            int cBligs = 0, cSnorgs = 0, cKords = 0;
            while (toyWant-- > 0) {
                String[] line = in.nextLine().split(" ");
                cBligs += new Integer(line[0]);
                cSnorgs += new Integer(line[1]);
                cKords += new Integer(line[2]);
            }

            int numContractors = new Integer(in.nextLine());
            int smallestCharge = Integer.MAX_VALUE;
            String name = "";
            while (numContractors-- > 0) {
                int totalPrice = 0;

                String[] line = in.nextLine().split(" ");
                int dBligs = 0, dSnorgs = 0, dKords = 0, pay = 0;

                dBligs = new Integer(line[1]);
                dSnorgs = new Integer(line[2]);
                dKords = new Integer(line[3]);
                pay = new Integer(line[4]);

                int fBligs = 0, fSnorgs = 0, fKords = 0;

                do {
                    fBligs += dBligs;
                    fSnorgs += dSnorgs;
                    fKords += dKords;
                    totalPrice += pay;
                } while (fBligs < cBligs || fSnorgs < cSnorgs || fKords < cKords);
                if (totalPrice <= smallestCharge) {
                    smallestCharge = totalPrice;
                    name = line[0];
                }
            }
            System.out.println(name + " " + smallestCharge);
        }
    }
}
