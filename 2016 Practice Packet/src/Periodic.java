import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/21/2016.
 */
public class Periodic {
    static ArrayList<String> table;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("periodic.dat"));
        table = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String[] line = in.nextLine().split(" ");
            for (int j = 0; j < 25; j++) {
                table.add(line[j].toLowerCase());
            }
        }

        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String word = in.nextLine();
            int index = word.length();
            int counter = 0;
            while (counter < word.length()) {
                String test1 = "";
                if (index == 0) {
                    break;
                }
                if (word.length() >= 2)
                    test1 = word.substring(0, 2);
                String test2 = word.substring(0, 1);
                if (table.contains(test2)) {
                    word = word.substring(1);
                    index--;
                    counter--;
                }
                else if (table.contains(test1)) {
                    word = word.substring(2);
                    index -= 2;
                    counter -= 2;
                }
                else
                    break;
                counter++;
            }
            System.out.println(index == 0 ? "yes" : "no");
        }
    }
}
