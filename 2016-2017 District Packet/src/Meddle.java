import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/14/2016.
 */
public class Meddle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("meddle.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            char[] alphabet = in.nextLine().toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            for (int i = 0; i < alphabet.length; i++) {
                charList.add(alphabet[i]);
            }
            int words = new Integer(in.nextLine());
            for (int i = 0; i < words; i++) {
                boolean b = false;
                String word = in.nextLine();
                char[] charLists = word.toCharArray();
                int k = 0;
                //Go through each word character
                for (int j = 0; j < charLists.length; j++) {
                    //Go through each character from alphabet
                    boolean c = false;
                    for (; k < charList.size(); k++) {
                        //
                        if ((charList.get(k)).equals((charLists[j]))) {
                            b = true;
                            c = true;
                            break;
                        }
                    }
                    if (c == false) {
                        b = false;
                    }
                }
                System.out.println(b ? word + ": YES" : word + ": NO");
            }
            System.out.println();
        }
    }
}
