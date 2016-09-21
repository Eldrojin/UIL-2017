import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by nguyenl on 9/21/2016.
 */
public class War {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("war.dat"));
        int sets = Integer.parseInt(in.nextLine());
        Map<String, Integer> cardValue = new TreeMap<>();
        for (int i = 2; i <= 10; i++) {
            cardValue.put(Integer.toString(i), i);
        }
        cardValue.put("J", 11);
        cardValue.put("Q", 12);
        cardValue.put("K", 13);
        cardValue.put("A", 14);

        while (sets-- > 0) {
            String[] deck1 = in.nextLine().split(" ");
            String[] deck2 = in.nextLine().split(" ");

            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < deck1.length; i++) {
                if (cardValue.get(deck1[i]) == cardValue.get(deck2[i])) {
                    //int war1 = cardValue.get(deck1[i]) + cardValue.get(deck1[i + 1]) + cardValue.get(deck1[i + 2]);
                    //int war2 = cardValue.get(deck2[i]) + cardValue.get(deck2[i + 1]) + cardValue.get(deck2[i + 2]);
                    if (cardValue.get(deck1[i + 4]) > cardValue.get(deck2[i + 4])) {
                        sum1 += 10;
                    }
                    else
                        sum2 += 10;
                    i += 10;
                }
                if (cardValue.get(deck1[i]) > cardValue.get(deck2[i])) {
                    sum1 += 2;
                } else
                    sum2 += 2;
            }
            System.out.println(sum1 + " " + sum2);
        }
    }
}
