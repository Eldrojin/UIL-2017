import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 12/1/2016.
 */
public class Abigail {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("abigail.dat"));

        while (in.hasNext()) {
            String[] nums = in.nextLine().split(" ");
            int squareRoot = new Integer(nums[2]);
            for (int i = squareRoot; i >= 0; i--) {
            }
        }
    }
}
