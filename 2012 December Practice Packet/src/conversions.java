import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/30/2016.
 */
public class conversions {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("conversions.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            double d = in.nextDouble();

            System.out.printf("%.2f%n", crash(a, b));
            System.out.printf("%.2f%n", dash(a, b));
            System.out.printf("%.2f%n", mash(a, b));
            System.out.printf("%.2f%n", trash(a, b, c, d));
            System.out.println();
        }
    }

    static double crash(double a, double b) {
        return (a /4) + 7 * b;
    }

    static double dash(double a, double b) {
        return ((a + Math.pow(b, 2))
                /
                (a + (1 / b))) + (a / b);
    }

    static double mash(double a, double b) {
        return 1 / ((1/a) - (1/b));
    }

    static double trash(double a, double b, double c, double d) {
        return ((4 / (a / b)) * Math.pow(((1 + (5 / (c + d))) / a), 1.0/2) - (a / (c + d)));
    }
}
