import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by isenseed on 10/19/2016.
 */
public class CrosswordClues {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("crosswordclues.dat"));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String[] line = in.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                list.add(line[j]);
            }
        }

        while (in.hasNext()) {
            String regex = in.next().replaceAll("\\*", ".");
            boolean b = false;
            for (String s : list) {
                if (s.matches(regex)) {
                    System.out.print(s + " ");
                    b = true;
                }
            }
            if (b == false) {
                System.out.print("NO MATCH");
            }
            System.out.println();
        }
    }
}
