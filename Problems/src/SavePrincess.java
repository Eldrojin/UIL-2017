import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by nguyenl on 11/2/2016.
 */
public class SavePrincess {
    public static int smallestSteps = Integer.MAX_VALUE;
    public static Stack<String> answer = new Stack<>();
    static Scanner inn = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("savePrincess.dat"));
        int size = Integer.parseInt(in.nextLine().trim());

        char[][] map = new char[size][size];
        int xLoc = 0, yLoc = 0;
        for (int i = 0; i < size; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < size; j++) {
                map[i][j] = line[j];
                if (map[i][j] == 'm') {
                    xLoc = i;
                    yLoc = j;
                }
            }
        }
        recurse(xLoc, yLoc, map, 0, new Stack<String>());
        for (String s : answer) {
            System.out.println(s);
        }

    }

    public static void recurse(int r, int c, char[][] map, int steps, Stack<String> stack) {
        if (r >= 0 && r < map.length && c >= 0 && c < map[r].length && map[r][c] != 'V' && steps < smallestSteps) {
            if (map[r][c] == 'p' && steps < smallestSteps) {
                smallestSteps = steps;
                answer = (Stack<String>)stack.clone();
                map[r][c] = 'p';
            } else {
                map[r][c] = 'V';
                stack.push("DOWN");
                recurse(r + 1, c, map, steps + 1, stack);
                stack.pop();
                stack.push("RIGHT");
                recurse(r, c + 1, map, steps + 1, stack);
                stack.pop();
                stack.push("UP");
                recurse(r - 1, c, map, steps + 1, stack);
                stack.pop();
                stack.push("LEFT");
                recurse(r, c - 1, map, steps + 1, stack);
                stack.pop();
                map[r][c] = '-';
            }
        }
    }
}
