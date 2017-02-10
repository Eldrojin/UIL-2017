/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class Average {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("average.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String [] numbers = in.nextLine().split(" ");
            double total = 0;
            for (int i = 0; i < numbers.length; i++) {
                total += Math.pow(new Double(numbers[i]),2);
            }
            double average = Math.sqrt(total/numbers.length);
            System.out.printf("%.3f%n", average);
        }
    }
}
