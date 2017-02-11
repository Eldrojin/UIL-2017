/**
 * Created by uil on 2/11/2017.
 */

import java.util.*;
import java.io.*;

public class Olga {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("olga.dat"));

        while (in.hasNext()) {
            String name = in.nextLine();
            String newName = name;
            name = name.toUpperCase();

            if (name.length() % 2 == 0) {
                newName = "\"" + newName + "\"";
            } else {
                newName = "\'" + newName + "\'";
            }
            if (name.substring(0, 1).compareTo("M") < 1) {
                newName = "\\" + newName + "/";
            } else
                newName = "\\\\" + newName + "//";
            if (name.length() < 6) {
                newName = "-" + newName + "-";
            } else {
                newName = "=" + newName + "=";
            }
            System.out.println(newName);
//            if (name.length() < 6) {
//                if (name.length() % 2 == 0) {
//                    if ((int) name.charAt(0) > 65 + (26 / 2) + 1) {
//                        System.out.println("-\\\\\""+ name + "\"//-");
//                    } else {
//                        System.out.println("-\\\"" + name + "\"/-");
//                    }
//                } else {
//                    if (name.length() % 2 != 0) {
//                        if ((int) name.charAt(0) > 65 + (26 / 2) + 1) {
//                            System.out.println("-\\\\\'"+ name + "\'//-");
//                        } else {
//                            System.out.println("-\\\'" + name + "\'/-");
//                        }
//                    }
//                }
//            } else {
//                if (name.length() % 2 == 0) {
//                    if ((int) name.charAt(0) > 65 + (26 / 2) + 1) {
//                        System.out.println("=\\\\\""+ name + "\"//=");
//                    } else {
//                        System.out.println("=\\\"" + name + "\"/=");
//                    }
//                } else {
//                    if (name.length() % 2 != 0) {
//                        if ((int) name.charAt(0) > 65 + (26 / 2) + 1) {
//                            System.out.println("=\\\\\'"+ name + "\'//=");
//                        } else {
//                            System.out.println("=\\\'" + name + "\'/=");
//                        }
//                    }
//                }
//            }
        }
    }
}
