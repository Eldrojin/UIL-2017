import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/10/2016.
 */
public class ImageFlip {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("imageflip.dat"));
        int sets = new Integer(in.nextLine().trim());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            char[][] rPainting = new char[new Integer(line[0])][new Integer(line[1])];
            for (int i = 0; i < rPainting.length; i++) {
                char[] lines = in.nextLine().toCharArray();
                for (int j = 0; j < rPainting[i].length; j++) {
                    rPainting[i][j] = lines[j];
                }
            }

            char[][] nPainting = new char[new Integer(line[0])][new Integer(line[1])];
            if (line[2].equalsIgnoreCase("H")) {
                for (int i = 0; i < nPainting.length; i++) {
                    for (int j = nPainting[i].length - 1, c = 0; j >= 0; j--, c++) {
                        nPainting[i][c] = rPainting[i][j];
                    }
                }
            } else {
                for (int i = nPainting.length - 1, b = 0; i >= 0; i--, b++) {
                    for (int j = 0; j < nPainting[i].length; j++) {
                        nPainting[b][j] = rPainting[i][j];
                    }
                }
            }


            for (char[] chars : nPainting) {
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
