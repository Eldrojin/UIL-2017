import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nguyenl on 1/24/2017.
 */
public class Code {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("code.dat"));
        int sets = Integer.parseInt(in.nextLine());
        char[] mainAlphabet = new char[26];
        for (int k = 97, b = 0; k < 97 + 26; k++, b++) {
            mainAlphabet[b] = (char)k;
        }

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            String alphabetRead = line[0];
//            Build the actual decryption / encryption key
            char[] alphabet = new char[alphabetRead.length()];
            for (int i = 0; i < alphabet.length; i++) {
                alphabet[i] = alphabetRead.charAt(i);
            }
            int offset = new Integer(line[1]);
            int messageNum = new Integer(in.nextLine());
            for (int i = 0; i < messageNum; i++) {
                String lines = in.nextLine();
                String types = lines.substring(0, 1);
                String message = lines.substring(2);
                char[] translate = message.toCharArray();
                String newMessage = "";
                if (types.equalsIgnoreCase("E")) {
                    for (int j = 0; j < translate.length; j++) {
                        if (translate[j] == ' ' || Character.isUpperCase(translate[j]) || !Character.isLetter(translate[j]) || Character.isDigit(translate[j])) {
                            continue;
                        }
                        int t = find(mainAlphabet, alphabet[find(mainAlphabet, translate[j])]) + offset;
                        if (t < 0) {
                            t = 25 + offset;
                        } else if (t > 26) {
                            t = (25 + offset) - 26;
                        }
                        translate[j] = mainAlphabet[t];
                    }
                    System.out.println(Arrays.toString(translate));
                } else {
                    for (int j = 0; j < translate.length; j++) {

                    }
                }
            }
        }
    }

    public static int find(char[] arr, char key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
