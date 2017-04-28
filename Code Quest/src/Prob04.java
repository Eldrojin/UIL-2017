/*
ID: 18nguye1
LANG: JAVA
PROG: 
*/

import java.io.*;
import java.util.*;

public class Prob04 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Prob04.in.txt"));
        int sets = new Integer(in.nextLine());

        while (in.hasNext()) {
            String lines = in.nextLine();
            String[] line = lines.split("\\|");
            ArrayList<Character> fWord = new ArrayList<>();
            ArrayList<Character> sWord = new ArrayList<>();

            for (int i = 0; i < line[0].length(); i++) {
                fWord.add(line[0].charAt(i));
            }
            for (int i = 0; i < line[1].length(); i++) {
                sWord.add(line[1].charAt(i));
            }

            boolean b = true;
            for (Character character : sWord) {
                if (!fWord.contains(character)) {
                    b = false;
                    break;
                }
            }
            if (line[0].equalsIgnoreCase(line[1])) {
                b = false;
            }
            System.out.print(lines + " = ");
            System.out.println((b) ? "ANAGRAM" : "NOT AN ANAGRAM");
        }
    }
}
