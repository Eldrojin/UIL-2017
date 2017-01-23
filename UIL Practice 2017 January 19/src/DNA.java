import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by uil on 1/19/2017.
 */
public class DNA {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dna.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            char[]arr = in.nextLine().toCharArray();
            char[]arr2 = in.nextLine().toCharArray();
            if(arr.length == arr2.length)
            {
                String ans = "BAD";
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == 'A') ans = arr2[i]=='T'? "GOOD" : "BAD";
                    else if(arr[i] == 'T') ans = arr2[i]=='A'? "GOOD" : "BAD";
                    else if(arr[i] == 'C') ans = arr2[i]=='G'? "GOOD" : "BAD";
                    else if(arr[i] == 'G') ans = arr2[i]=='C'? "GOOD" : "BAD";
                    else if(arr[i] != 'A' || arr[i]=='G' || arr[i]=='T' || arr[i] == 'C') ans = "BAD";
                    if(ans.equals("BAD")) break;
                }
                System.out.println(ans);
            }
            else System.out.println("BAD");
        }
    }
}
