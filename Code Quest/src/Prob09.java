import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by dystr on 4/28/2017.
 */
public class Prob09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Prob09.in.txt"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            double[] values = new double[3];
            for (int i = 0; i < values.length; i++) {
                values[i] = new Double(line[i]);
            }
            double zoom = values[0];
            double latitude = values[1];
            double longitude = values[2];
            double x = ((longitude + 180) / 360.0) * Math.pow(2, zoom);
            double y = (1 - (Math.log(Math.tan(latitude * (Math.PI / 180)) + (1.0 / Math.cos(latitude * (Math.PI / 180)))) / Math.PI)) * Math.pow(2, zoom - 1);
            System.out.printf("http://tile.openstreetmap.org/%d/%d/%d.png%n", (int)zoom, (int)x, (int)y);
        }
    }
}
