/**
 * Created by uil on 2/9/2017.
 */

import java.util.*;
import java.io.*;

public class ConvertMe {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("convertme.dat"));
        int sets = new Integer(in.nextLine());

        while (sets-- > 0) {
            String [] arr = in.nextLine().split(" ");
            int N = new Integer(arr[0]);
            int M = new Integer(arr[1]);
            int factor = -1;
            boolean factors = false;
            outer : for (int i = N-1; i>1; i--) {
                if(N%i==0 && M%i==0)
                {
                    factor = i;
                    int count = 0;
                    int n = N;
                    int m = M;
                    while(n < m)
                    {
                        n+=factor;
                        count++;
                        if(n > m) break;
                        if(n==m){System.out.println(count);factors = true; break outer;}
                    }

                }
            }
            if(!factors)
            {
                System.out.println(-1);
            }
        }
    }
}
