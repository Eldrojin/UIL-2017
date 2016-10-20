import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class dryrun {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dryrun.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            System.out.println("I like " + in.nextLine());
        }
    }
}
