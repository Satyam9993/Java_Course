package CollectionData;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDataStructure {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(10);
        hs.add(9);
        hs.add(10);
        hs.add(11);
        System.out.println(hs);
        System.out.println(hs.contains(11));
        hs.remove(11);
        System.out.println(hs);
        System.out.println(hs.size());

        // Iterator
        System.out.println(hs);

//        for(int i : hs){
//            System.out.println(i);
//        }

        Iterator it = hs.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
