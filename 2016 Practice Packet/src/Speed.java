import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/20/2016.
 */
public class Speed {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("speed.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            Double d = Double.parseDouble(in.nextLine().trim());
            System.out.printf("%.1f%n", ((d / 5)));
        }
    }
}
