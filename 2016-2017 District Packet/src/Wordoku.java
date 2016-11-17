import java.io.*;
import java.util.*;
public class Wordoku {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("wordoku.dat"));
        int sets = new Integer(in.nextLine());
        while (sets-- > 0) {
            int size = new Integer(in.nextLine());
            String[][] wordoku = new String[size][size];
            boolean b1 = true;
            for (int i = 0; i < size; i++) {
                String[] line = in.nextLine().split(" ");
                for (int j = 0; j < size; j++) {
                    wordoku[i][j] = line[j];
                }
            }
            if (in.hasNextLine())
                in.nextLine();
            HashSet<String> testLetters1 = new HashSet<>();
            for (int i = 0; i < size; i++) {
                testLetters1.add(wordoku[0][i]);
            }
            for (int i = 0; i < size; i++) {
                HashSet<String> testing = new HashSet<>();
                for (int j = 0; j < size; j++) {
                    testing.add(wordoku[i][j]);
                }
                if (testing.retainAll(testLetters1))
                    b1 = false;
            }
            System.out.println(b1 ? "VALID" : "INVALID");
        }
    }
}
