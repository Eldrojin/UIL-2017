import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by nguyenl on 11/15/2016.
 */
public class Mutual {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("mutual.dat"));
        int sets = new Integer(in.nextLine());

        int caseNum = 1;
        while (sets-- > 0) {
            int myFrindsList = new Integer(in.nextLine());
            ArrayList<String> friendsList = new ArrayList<>();
            for (int i = 0; i < myFrindsList; i++) {
                friendsList.add(in.nextLine());
            }

            int hisFriendsList = new Integer(in.nextLine());
            ArrayList<String> friendsList2 = new ArrayList<>();
            for (int i = 0; i < hisFriendsList; i++) {
                friendsList2.add(in.nextLine());
            }
            ArrayList<String> newList = new ArrayList<>();
            for (String s : friendsList) {
                for (String s1 : friendsList2) {
                    if (s.equals(s1)) {
                        newList.add(s);
                    }
                }
            }

            System.out.println("Case " + caseNum++ + ":");
            Collections.sort(newList);
            for (String s : newList) {
                System.out.println(s);
            }
        }
    }
}
