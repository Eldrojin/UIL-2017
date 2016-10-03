import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/3/2016.
 */
public class testparity {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("testparity.dat"));
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            double score = in.nextInt();
            if (score > 100 && score <= 120) {
                score *= .9;
            } else if (score <= 100 && score > 75) {
            } else if (score > 50 && score <= 75) {
                score *= 1.25;
            } else if (score > 25 && score <= 50) {
                score *= 1.5;
            } else if (score > 0 && score <= 25) {
                score *= 2;
            }
            list.add((int) Math.round(score));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print(list.get(list.size() - 1));
    }
}
