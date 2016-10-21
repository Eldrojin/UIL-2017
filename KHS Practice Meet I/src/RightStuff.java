import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/21/2016.
 */
public class RightStuff {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("rightstuff.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            boolean both = false, accurate = false, precise = false;
            double[] dataList = new double[line.length - 1];
            double accepted = Double.parseDouble(line[0]);
            for (int i = 0; i < dataList.length; i++) {
                dataList[i] = Double.parseDouble(line[i + 1]);
            }
            Arrays.sort(dataList);
            double sum = 0;
            for (double v : dataList) {
                sum += v;
            }
            double avg = sum / dataList.length;
            double accuracy = (accepted * .05);
            if (avg <= accepted + accuracy && avg >= accepted - accuracy) {
                accurate = true;
            }

            double range = dataList[dataList.length - 1] - dataList[0];
            if (range <= avg * .1) {
                precise = true;
            }
            if (precise && accurate) {
                both = true;
            }

            if (both) {
                System.out.println("Both");
            } else if (precise) {
                System.out.println("Precise");
            } else if (accurate)
                System.out.println("Accurate");
            else
                System.out.println("Neither");
        }
    }
}
