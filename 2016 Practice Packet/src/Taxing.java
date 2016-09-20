import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/20/2016.
 */
public class Taxing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("taxing.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            double price = Double.parseDouble(in.nextLine().trim());
            System.out.printf("$%.2f%n", price * 1.0825);
        }
    }
}
