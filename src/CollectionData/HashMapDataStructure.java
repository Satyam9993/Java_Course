package CollectionData;
import java.util.*;

public class HashMapDataStructure {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Satyam");
        hm.put(2, "Katiyar");

        System.out.println(hm);
        // Contains
        System.out.println(hm.containsKey(11));


        System.out.println(hm.get(1));
        System.out.println(hm.get(11));


        // Iterating HashMap
        for(Map.Entry<Integer, String> e:hm.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }

        Set<Integer> s = hm.keySet();

        for(int i:s){
            System.out.println(i);
        }
    }
}
