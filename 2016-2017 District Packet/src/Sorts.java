import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by nguyenl on 11/28/2016.
 */
public class Sorts {
    public static void main(String[] args) throws FileNotFoundException {
        int[] sort = new int[100000];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = new Random().nextInt(100000) + 1;
        }
        int[] clonedArray = sort.clone();
        long start = System.currentTimeMillis();
        int[] finalArray = selectionSortInteger(sort);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        //System.out.println(Arrays.toString(finalArray));
        System.out.println(test(5));
        start = System.currentTimeMillis();
        finalArray = selectionSortInteger(clonedArray);
        stop = System.currentTimeMillis();
        System.out.println(stop - start);
        //System.out.println(Arrays.toString(finalArray));
    }

    public static int[] bubbleSort(int[] sort) {
        for (int i = sort.length; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                int i1 = sort[j];
                if (i1 < sort[j - 1]) {
                    int temp = i1;
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
            }
        }
        return sort;
    }

    public static int[] selectionSortCurrent (int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            int min = sort[i];
            int index = i;
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[j] < min) {
                    min = sort[j];
                    index = j;
                }
            }
            int temp = sort[i];
            sort[i] = min;
            sort[index] = temp;
        }
        return sort;
    }

    public static int[] selectionSortInteger (int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < sort.length; j++) {
                if (sort[j] < min) {
                    min = sort[j];
                    index = j;
                }
            }
            int temp = sort[i];
            sort[i] = min;
            sort[index] = temp;

        }
        return sort;
    }

    public static int[] insertionSort(int[] sort) {
        for (int i = 1; i < sort.length; i++) {
            int index = i;
            while (index != 0 && sort[index] < sort[index - 1]) {
                int temp = sort[index];
                sort[index] = sort[index - 1];
                sort[index - 1] = temp;
                --index;
            }
        }
        return sort;
    }

    public static int test(int boy) {
        return 3;
    }
}
