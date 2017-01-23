/**
 * Created by uil on 1/19/2017.
 */
import java.util.*;
import java.io.*;

public class DryRun {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("dryrun.dat"));
        while(in.hasNextLine())
        {
            System.out.println("I Like " + in.nextLine());
        }
    }
}
