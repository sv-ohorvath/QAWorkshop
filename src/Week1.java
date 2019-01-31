import java.util.ArrayList;
import java.util.Collections;
//difference between max & min of an array

public class Week1 {
    public static int diff(ArrayList<Integer> list) {
        int max = list.get(0);
        int min = list.get(0);
        for (int item : list) {
            if (max < item) {
                max = item;
            } else if (min > item) {
                min = item;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        Collections.addAll(lista, 34, 1, 2, 3, 4);
        System.out.println(lista);
        System.out.println(Week1.diff(lista));
    }
}



