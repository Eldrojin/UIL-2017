import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nguyenl on 10/3/2016.
 */
public class WeirdChange {
    static int coin1 = Integer.MAX_VALUE, coin5 = Integer.MAX_VALUE, coin13 = Integer.MAX_VALUE, coin23 = Integer.MAX_VALUE, coin37 = Integer.MAX_VALUE, coin47 = Integer.MAX_VALUE;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("weirdChange.dat"));
        while (in.hasNext()) {
            int uilCoins = in.nextInt();
            double cost = uilCoins * .03;
            coin1 = Integer.MAX_VALUE; coin5 = Integer.MAX_VALUE; coin13 = Integer.MAX_VALUE; coin23 = Integer.MAX_VALUE; coin37 = Integer.MAX_VALUE; coin47 = Integer.MAX_VALUE;
            /*if (uilCoins >= 47) {
                coin47 = uilCoins / 47;
                uilCoins -= coin47 * 47;
            }
            if (uilCoins >= 23) {
                coin23 = uilCoins / 23;
                uilCoins -= coin23 * 23;
            }
            if (uilCoins >= 13) {
                coin13 = uilCoins / 13;
                uilCoins -= coin13 * 13;
            }
            if (uilCoins >= 5) {
                coin5 = uilCoins / 5;
                uilCoins -= coin5 * 5;
            }*/
            //coin1 = uilCoins;
            findInt(uilCoins, 0, 0, 0, 0, 0, 0);
            System.out.printf("$%.2f %d %d %d %d %d %d%n", cost, WeirdChange.coin47, WeirdChange.coin37, WeirdChange.coin23, WeirdChange.coin13, WeirdChange.coin5, WeirdChange.coin1);
        }
    }

    public static void findInt(int uilCoins, int coin47, int coin37, int coin23, int coin13, int coin5, int coin1) {
        if (uilCoins <= 0) {
            if (coin47 < WeirdChange.coin47) {
                WeirdChange.coin47 = coin47;
            }
            if (coin37 < WeirdChange.coin37) {
                WeirdChange.coin37 = coin37;
            }
            if (coin23 < WeirdChange.coin23) {
                WeirdChange.coin23 = coin23;
            }
            if (coin13 < WeirdChange.coin13) {
                WeirdChange.coin13 = coin13;
            }
            if (coin5 < WeirdChange.coin5) {
                WeirdChange.coin5 = coin5;
            }
            if (coin1 < WeirdChange.coin1) {
                WeirdChange.coin1 = coin1;
            }
        }
        else {
            if (uilCoins >= 47) {
                coin47++;
                findInt(uilCoins - 47, coin47, coin37, coin23, coin13, coin5, coin1);
                //coin47--;
            }
            if (uilCoins >= 37) {
                coin37++;
                findInt(uilCoins - 37, coin47, coin37, coin23, coin13, coin5, coin1);
                //coin37--;
            }
            if (uilCoins >= 23) {
                coin23++;
                findInt(uilCoins - 23, coin47, coin37, coin23, coin13, coin5, coin1);
                //coin23--;
            }
            if (uilCoins >= 13) {
                coin13++;
                findInt(uilCoins - 13, coin47, coin37, coin23, coin13, coin5, coin1);
                //coin13--;
            }
            if (uilCoins >= 5) {
                coin5++;
                findInt(uilCoins - 5, coin47, coin37, coin23, coin13, coin5, coin1);
                //coin5--;
            } else {
                coin1++;
                findInt(uilCoins - 1, coin47, coin37, coin23, coin13, coin5, coin1);
                // coin1--;
            }
        }
    }
}
