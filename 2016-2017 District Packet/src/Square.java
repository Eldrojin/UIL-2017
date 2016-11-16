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
                int counter = 1;
                while (sum <= new Integer(num)) {
                    sum += (int) (Math.pow(counter++, 2));

                }
            }

            if (sum == new Integer(num)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
