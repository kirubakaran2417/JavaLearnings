package collectionss;

import java.util.*;

public class CollectionExample3 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Aravind");
        map.put(2, "Bharath");
        map.put(3, "Aravind");
        map.put(4, "kiruba");

        //accessing
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        //size
        System.out.println(map.size());

        //contains
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Aravind"));

        //remove
        map.remove(1);
        System.out.println(map);

        //clear
//        map.clear();
//        System.out.println(map);

       //keyset
        //values
        //entry loop
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
