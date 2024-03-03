package CollectionData;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListData {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        // Adding Element
        a.add(4);
        a.add(2);
        a.add(1);

        // Get Element
        a.get(0);
        a.get(1);
        a.get(2);

        // add el in between
        a.add(0, -1);


        // set element at index
        a.set(0, -2);

        // size
        System.out.println(a.size());


        // searching
        System.out.println(a.indexOf(1));

        // Sorting
        Collections.sort(a);

        // remove
        a.remove(0);

        System.out.println(a);
    }
}
