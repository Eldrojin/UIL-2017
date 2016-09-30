import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/30/2016.
 */
public class flexjbox {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("flexjbox.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            int rows = in.nextInt(), cols = in.nextInt();
            int x = in.nextInt(), y = in.nextInt();

            char[][] box = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    box[i][j] = '*';
                }
            }

            box[x][y] = 'J';

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(box[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
