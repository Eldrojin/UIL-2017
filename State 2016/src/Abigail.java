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
            int factor1 = 0;
            int factor2 = 0;
            int factor3 = 0;
            int squareRoot = new Integer(nums[2]);
            outer: for (int j = 0; j <= squareRoot / 2; j++) {
                for (int k = 0; k < squareRoot / 2; k++) {
                    if (k * k == squareRoot) {
                        factor1 = k;
                        factor2 = k;
                    }
                    if (k * k == j) {
                        factor1 = j;
                        for (int l = 0; l < squareRoot; l++) {
                            if (factor1 * l == squareRoot) {
                                factor2 = l;
                                break outer;
                            }
                        }
                    }
                }
            }
            System.out.println("Factor 1: " + factor1);
            System.out.println("Factor 2: " + factor2);

        }
    }
}
