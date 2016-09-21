import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/20/2016.
 */
public class Integral {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("integral.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            double num1 = Double.parseDouble(line[0]);
            double num2 = Double.parseDouble(line[1]);
            double num3 = Double.parseDouble(line[2]);
            double sum = 0;
            for (; num1 < num2; num1 += num3) {
                sum += (3 * Math.pow(num1, 2) + (2 * num1) + 1) * num3;
            }
            System.out.printf("%.6f%n", sum);
        }
    }
}
