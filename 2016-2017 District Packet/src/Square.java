import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("square.dat"));

        while (in.hasNext()) {
            String num = in.nextLine();
            int sum = 0;
            if (num.equals((new StringBuilder(num)).reverse().toString())) {
                outer : for (int i = 0; i < new Integer(num); i++) {
                    sum = 0;
                    for (int j = i; j < new Integer(num); j++) {
                        sum += (int) (Math.pow(j, 2));
                        if (sum == new Integer(num)) {
                            break outer;
                        }
                    }
                }
            }
            System.out.println(sum == new Integer(num) ? "YES" : "NO");
        }
    }
}
