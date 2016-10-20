import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class AlmostPrime {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("almostprime.dat"));
        int finalNum = 4;
        while (in.hasNext()) {
            int num = 4;
            int counter = 0;
            int stop = Integer.parseInt(in.nextLine());
            while (counter < stop) {
                int primeCounter = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        primeCounter++;
                    }
                    if (primeCounter > 3) {
                        break;
                    }
                }
                if (primeCounter == 3) {
                    counter++;
                }
                if (counter == stop) {
                    finalNum = num;
                } else {
                    num++;
                }
            }
            System.out.println(finalNum);

        }
    }
}
