import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 12/7/2016.
 */
public class Dara {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("dara.dat"));

        while (in.hasNext()) {
            String mainExpression = in.nextLine();
            String[] parseExpression = mainExpression.split("( \\+ )|( - )");
            System.out.println(Arrays.toString(parseExpression));
            for (int i = 0; i < parseExpression.length; i++) {
                if (!parseExpression[i].contains("X")) {
//                    parseExpression[i] =
                }
            }
        }
    }
}
