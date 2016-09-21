import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by 18nguyenl on 9/21/2016.
 */
public class MixEmUp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("mixemup.dat"));
        int sets = Integer.parseInt(in.nextLine().trim());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            LinkedList<String> pile = new LinkedList<>();
            for (String s : line) {
                pile.add(s);
            }

            for (int i = 1; i < pile.size(); i++) {
                if (pile.get(i - 1).equals(pile.get(i))) {
                    pile.addLast(pile.remove(i));
                }
            }

            String answer = "";
            for (String s : pile) {
                answer += s + " ";
            }
            System.out.println(answer);
            //System.out.println(pile);
        }
    }
}
