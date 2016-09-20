import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/20/2016.
 */
public class Almost {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("almost.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            char[][] ticTacToes = new char[3][3];
            char[][] invertTicTacToes = new char[3][3];
            for (int i = 0; i < 3; i++) {
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < line.length; j++) {
                    ticTacToes[i][j] = line[j];
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    invertTicTacToes[i][j] = ticTacToes[j][i];
                }
            }

            int blankCounter = 0;
            int xCounter = 0;
            int x = 0, y = 0;

            //Testing for horizontal case
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (ticTacToes[i][j] == 'X')
                        xCounter++;
                    if (ticTacToes[i][j] == ' ') {
                        blankCounter++;
                        x = i;
                        y = j;
                    }
                }
                if (blankCounter == 1 && xCounter == 2) {
                    System.out.println((x + 1) + " " + (y + 1));
                }
                xCounter = 0;
                blankCounter = 0;
            }

            //Testing for vertical case
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (invertTicTacToes[i][j] == 'X')
                        xCounter++;
                    if (invertTicTacToes[i][j] == ' ') {
                        blankCounter++;
                        x = i;
                        y = j;
                    }
                }
                if (blankCounter == 1 && xCounter == 2) {
                    System.out.println((y + 1) + " " + (x + 1));
                }
                xCounter = 0;
                blankCounter = 0;
            }

            //Testing for Diagonal 1
            if (ticTacToes[0][0] == 'X' && ticTacToes[1][1] == 'X' && ticTacToes[2][2] == ' ')
                System.out.println(3 + " " + 3);
            else if (ticTacToes[0][0] == 'X' && ticTacToes[1][1] == ' ' && ticTacToes[2][2] == 'X')
                System.out.println(2 + " " + 2);
            else if (ticTacToes[0][0] == ' ' && ticTacToes[1][1] == 'X' && ticTacToes[2][2] == 'X')
                System.out.println(1 + " " + 1);
            //Testing for Diagonal II
            else if (ticTacToes[2][0] == 'X' && ticTacToes[1][1] == 'X' && ticTacToes[0][2] == ' ')
                System.out.println(1 + " " + 3);
            else if (ticTacToes[2][0] == 'X' && ticTacToes[1][1] == ' ' && ticTacToes[0][2] == 'X')
                System.out.println(2 + " " + 2);
            else if (ticTacToes[2][0] == ' ' && ticTacToes[1][1] == 'X' && ticTacToes[0][2] == 'X')
                System.out.println(3 + " " + 1);
        }
    }
}
