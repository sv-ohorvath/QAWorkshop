import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Week2x2 {
    public static HashMap<Character, ArrayList<Integer>> dictionary = new HashMap<>();

    public static void countChar(String mystring) {

        for (int i = 0; i < mystring.length(); i++) {
            if (!dictionary.containsKey(mystring.charAt(i))) {
                dictionary.put(mystring.charAt(i), new ArrayList<Integer>(List.of(i)));
            } else {
                ArrayList<Integer> positions = dictionary.get(mystring.charAt(i));
                positions.add(i);
                dictionary.put(mystring.charAt(i), positions);
            }
        }
    }

    public static void displayMap(String mystring) {
        for (Character item : dictionary.keySet()) {
            System.out.println(item + " position: " + dictionary.get(item) + ", # times: " + dictionary.get(item).size());
        }
    }

    public static void main(String[] args) {
        String myString = "bla cla dla";
        Week2x2.countChar(myString);
        Week2x2.displayMap(myString);

    }
}