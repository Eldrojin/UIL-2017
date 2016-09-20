import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/20/2016.
 */
public class Touchy {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("touchy.dat"));
        int sets = in.nextInt();
        while (sets-- > 0) {
            int power = in.nextInt();
            int taps = in.nextInt();
            int endPower = 0;
            for (int i = power; taps >= 0; i++, taps--) {
                if (i == 4) {
                    i = 0;
                }
                endPower = i;
            }
            System.out.println(endPower);
        }
    }
}
