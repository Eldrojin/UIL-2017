import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/21/2016.
 */
public class Resize {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("resize.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split("( by )|( to )");
            double num1 = Integer.parseInt(line[0]), num2 = Integer.parseInt(line[1]), num3 = Integer.parseInt(line[2]), num4 = Integer.parseInt(line[3]);
            System.out.printf("%.2f by %.2f or %.2f by %.2f%n", num3, (num2 * num3) / num1, (num1 * num4) / num2, num4);
        }
    }
}
