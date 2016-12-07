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
            int factor1 = new Integer(nums[0]);
            int factor2 = new Integer(nums[1]);
            String i = "";
            if (nums[2].contains("-")) {
                nums[2] = nums[2].substring(1);
                i = "i";
            }
            int factor3 = new Integer(nums[2]);
            int squareRoot = new Integer(nums[2]);
            outer: for (int j = 0; j <= squareRoot / 2; j++) {
                for (int k = 0; k < squareRoot / 2; k++) {
                    if (k * k == squareRoot) {
                        factor3 = 0;
                        factor2 *= k;
                        break outer;
                    }
                    if (k * k == j) {
                        int found = k;
                        for (int l = 0; l < squareRoot; l++) {
                            if (j * l == squareRoot) {
                                factor3 = l;
                                factor2 *= found;
                                break outer;
                            }
                        }
                    }
                }
            }
            if (i.contains("i")) {
                System.out.println(factor1 + " " + factor2 + "i " + factor3);
            } else if (factor3 == 0) {
                System.out.println(factor1 + factor2 + " " + factor3 + " " + factor3);
            } else
                System.out.println(factor1 + " " + factor2 + " " + factor3);
        }
    }
}
