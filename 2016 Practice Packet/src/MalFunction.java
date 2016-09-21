import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/21/2016.
 */
public class MalFunction {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("malfunction.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());
        //in.next();
        while (sets-- > 0) {
            double d1 = in.nextDouble(), d2 = in.nextDouble(), d3 = in.nextDouble(), d4 = in.nextDouble();
            System.out.printf("%.3f%n", ((d1 * Math.pow(d4, 2)) + (d2 * d4) + d3));
        }
    }
}
