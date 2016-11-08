import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nguyenl on 11/2/2016.
 */
public class testClass {
    public static int smallestSteps = Integer.MAX_VALUE;
    public static LinkedList<String> answer = new LinkedList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("savePrincess.dat"));
        char[][] map = new char[5][5];
        int xLoc = in.nextInt(), yLoc = in.nextInt(), sXLoc = Integer.MAX_VALUE, sYLoc = Integer.MAX_VALUE;
        in.nextLine();
        for (int i = 0; i < 5; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < 5; j++) {
                map[i][j] = line[j];
                if (map[i][j] == 'd') {
                    if (Math.abs(xLoc - i) <= sXLoc && j <= sYLoc || Math.abs(i + j) < Math.abs(sXLoc + sYLoc)) {
                        sXLoc = i;
                        sYLoc = j;
                    }
                }
            }
        }
        System.out.println(sXLoc + " " + sYLoc);
        map[xLoc][yLoc] = 'b';

        if (sXLoc - xLoc >= 0) {
            map[++xLoc][yLoc] = 'b';
            System.out.println((map[xLoc][yLoc] == 'd') ? "CLEAN" : "RIGHT");
        } else {
            map[--xLoc][yLoc] = 'b';
            System.out.println((map[xLoc][yLoc] == 'd') ? "CLEAN" : "LEFT");
        }
        if (sYLoc - yLoc >= 0) {
            map[xLoc][++yLoc] = 'b';
            System.out.println((map[xLoc][yLoc] == 'd') ? "CLEAN" : "DOWN");
        }
        else {
            map[xLoc][--yLoc] = 'b';
            System.out.println((map[xLoc][yLoc] == 'd') ? "CLEAN" : "UP");
        }
    }
}

