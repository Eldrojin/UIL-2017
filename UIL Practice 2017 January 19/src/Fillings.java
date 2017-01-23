import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by uil on 1/19/2017.
 */
public class Fillings {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("fillings.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String[]arr = in.nextLine().split(" ");
            int permutations = new Integer(arr[0]);
            int start = new Integer(arr[1]);
            int ans = 1;
            for (int i = 0; i < permutations; i++) {
                ans *= start--;
            }
            System.out.println(ans);
        }
    }
}
