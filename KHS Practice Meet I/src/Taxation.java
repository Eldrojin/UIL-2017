import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class Taxation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("taxation.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        double total = 0;
        while (sets-- > 0) {
            String sets1 = in.nextLine();
            if (sets1.contains("T")) {
                String[] line = sets1.split(" ");
                total += Double.parseDouble(line[1]) * 1.0825;
            } else {
                total += Double.parseDouble(sets1);
            }
        }
        System.out.printf("The total is $%.2f", total);
    }
}
