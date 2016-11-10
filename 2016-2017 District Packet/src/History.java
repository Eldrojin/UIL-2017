import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/10/2016.
 */
public class History {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("history.dat"));
        String[] lines = in.nextLine().split(" ");
        int sets = new Integer(lines[0]);

        while (sets-- > 0) {
            String[] events = in.nextLine().split(" ");

            int total = new Integer(lines[1]);
            for (int i = 1; i < events.length; i++) {
                if (Integer.parseInt(events[i]) < Integer.parseInt(events[i - 1])) {
                    total--;
                }
            }
            System.out.println(total);
        }
    }
}
