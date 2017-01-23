import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by uil on 1/19/2017.
 */
public class Stealing {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("stealing.dat"));
        int sets= new Integer(in.nextLine());
        while(sets-->0)
        {
            String [] arr = in.nextLine().split(" ");
            int n = new Integer(arr[0]);
            int m = new Integer(arr[1]);
            int t = new Integer(arr[2]);
            int time = 0;
            while(n>0)
            {
                n -= m;
                time += t;
                if(n>0) time += t;
            }
            System.out.println(time);
        }
    }
}
