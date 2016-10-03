import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/3/2016.
 */
public class taxi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("taxi.dat"));
        //1.93
        while (in.hasNext()) {
            double miles = in.nextDouble() - 1.0/5;
            double secondsWaited = in.nextDouble();
            System.out.printf("$%.2f%n", .5 + (Math.ceil(miles / (1.0/5)) * .22) + (Math.ceil(secondsWaited / 60.0) * .2));
        }
    }
}
