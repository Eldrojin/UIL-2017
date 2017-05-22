import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by dystr on 3/26/2017.
 */
public class Playground {
    public static void main(String[] args) {
        mergeSort(new int[] {7, 8, 5, 2, 4, 6, 3}, 0, 6);
    }

    static void mergeSort(int[] a, int lo, int hi)
    {
        if (lo < hi)
        {
            int m = (lo + hi) / 2;
            mergeSort (a, lo, m);
            mergeSort (a, m+1, hi);
            merge (a, lo, hi);
        System.out.println(Arrays.toString(a));
        }
    }

    static void merge(int[] a, int lo, int hi)
    {
        int i, j, k, m;
        int n=hi-lo+1;
        int[] b=new int[n];           // temporary array

        k=0;
        m=(lo+hi)/2;
        // copy lower half to array b
        for(i=lo; i<=m; i++)
        {
            b[k]=a[i];
            k++;
        }
        // copy upper half to array b in opposite order
        for (j=hi; j>=m+1; j--)
        {
            b[k]=a[j];
            k++;
        }

        i=0;
        j=n-1;
        k=lo;

        // copy back next-greatest element at each time
        // until i and j cross
        while (i<=j)
        {
            if (b[i]<=b[j])
            {
                a[k]=b[i];
                k++;
                i++;
            }
            else
            {
                a[k]=b[j];
                k++;
                j--;
            }
        }
    }
}
