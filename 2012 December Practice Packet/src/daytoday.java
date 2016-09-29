import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by nguyenl on 9/29/2016.
 */
public class daytoday {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("daytoday.dat"));
        int sets = Integer.parseInt(in.nextLine());

        while (sets-- > 0) {
            String[] line = in.nextLine().split(" ");
            Calendar date1 = new GregorianCalendar(Integer.parseInt(line[2]), Integer.parseInt(line[1]), Integer.parseInt(line[0]));
            Calendar date2 = new GregorianCalendar(Integer.parseInt(line[5]), Integer.parseInt(line[4]), Integer.parseInt(line[3]));
            //SimpleDateFormat date1 = new SimpleDateFormat(line1[0] + " " + line1[1] + " " + line1[2]);
            //SimpleDateFormat date2 = new SimpleDateFormat(line1[3] + " " + line1[4] + " " + line1[5]);
            long date3 = date2.getTimeInMillis() - date1.getTimeInMillis();
            GregorianCalendar finalDate = new GregorianCalendar();
            finalDate.setTimeInMillis(date3);
            System.out.println(finalDate.getTime());
        }
    }
}
