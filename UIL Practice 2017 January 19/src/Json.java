import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Json {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("json.dat"));
        int sets = new Integer(in.nextLine());
        ArrayList<String> names = new ArrayList<>();
        ArrayList<list> namess = new ArrayList<>();
        while (sets-- > 0) {
            String parse = in.nextLine();
            if (parse.contains("print")) {
                String[] line = parse.split("\\(|\\)");
                for (int i = 0; i < namess.size(); i++) {
                    if (namess.get(i).name.equals(line[1])) {
                        System.out.println(namess.get(i));
                    }
                }
            } else {
                String[] line = parse.split("\\.| = ");
                if (!names.contains(line[0])) {
                    names.add(line[0]);
                    namess.add(new list(line[0]));
                }
                for (int i = 0; i < namess.size(); i++) {
                    if (namess.get(i).name.equals(line[0])) {
                        namess.get(i).add(line[1],line[2]);
                    }
                }
            }
        }
    }
}

class list {
    public String name;
    public HashMap<String, String> ingredients;

    public list(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }
    public void add(String key, String value) {
        ingredients.put(key, value);
    }
    public String toString() {
        String str = "{";
        for (String s : ingredients.keySet()) {
            str += s + " : " + ingredients.get(s) + ", ";
        }
        str = str.substring(0, str.length() - 2) + "}";
        return str;
    }
}
