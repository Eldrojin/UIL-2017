import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/17/2016.
 */
public class Paint {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("paint.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            //System.out.println(sets);
            String[] ln = in.nextLine().split(" ");
            int sz1 = new Integer(ln[0]), sz2 = new Integer(ln[1]);
            char[][] paper = new char[sz1][sz2];
            for (int i = 0; i < sz1; i++) {
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < sz2; j++) {
                    paper[i][j] = line[j];
                }
            }
            char[] query = in.nextLine().toCharArray();
            for (int i = 0; i < query.length; i++) {
                for (int j = 0; j < paper.length; j++) {
                    for (int k = 0; k < paper[i].length; k++) {
                        if (query[i] == 'H' && paper[j][k] == 'x') {
                            paper[j][paper[j].length - k - 1] = 'x';
                        }
                    }

                }
                for (int j = 0; j < paper[i].length; j++) {
                    for (int k = 0; k < paper.length; k++) {
                        if (query[i] == 'V' && paper[k][j] == 'x') {
                            paper[paper.length - k - 1][j] = 'x';
                        }
                    }
                }
            }
            for (char[] chars : paper) {
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println();
            }
        }
    }
}
