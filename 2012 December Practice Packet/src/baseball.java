import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/29/2016.
 */
public class baseball {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("baseball.dat"));
        while (in.hasNext()) {
            String[] line = in.nextLine().split(" ");
            String[] bases = {Integer.toString(1), line[0], line[1], line[2]};

            int hits = Integer.parseInt(line[3]);

            if (hits == 4) {
                bases = new String[] {Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0)};
            } else
            {
                for (int i = hits; i > 0; i--) {
                    if (i == hits - 1) {
                        bases[0] = "0";
                    }
                    for (int j = 3; j >= 1; j--) {
                        bases[j] = bases[j - 1];
                    }
                }
            }
            bases[0] = "0";
            System.out.println(bases[1] + " " + bases[2] +" " + bases[3] + " " + line[3]);
        }
    }
}
