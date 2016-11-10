import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/10/2016.
 */
public class GeneralFib {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("generalfib.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            int x = Integer.parseInt(line[0]), y = Integer.parseInt(line[1]), a = Integer.parseInt(line[2]), b = Integer.parseInt(line[3]), n = Integer.parseInt(line[4]);
            System.out.println(f(x, y, a, b, n));
        }
    }

    public static int f(int x, int y, int a, int b, int n) {
        if (n == 1) {
            return x;
        }
        if (n == 2) {
            return y;
        }
        return a * f(x, y, a, b, n - 1) + b * f(x, y, a, b, n - 2);
    }
}
