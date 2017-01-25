import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 1/24/2017.
 */
public class Code {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("code.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            String alphabetRead = line[0];
//            Build the actual decryption / encryption key
            String[] alphabet = new String[alphabetRead.length()];
            for (int i = 0; i < alphabet.length; i++) {
                alphabet[i] = "" + alphabetRead.charAt(i);
            }
            int offset = new Integer(line[1]);
            int messageNum = new Integer(in.nextLine());
            for (int i = 0; i < messageNum; i++) {
                String lines = in.nextLine();
                String types = lines.substring(0, 1);
                String message = lines.substring(1);
                char[] translate = message.toCharArray();
                String newMessage = "";
                for (int j = 0; j < translate.length; j++) {
                    
                }
            }
        }
    }
}
