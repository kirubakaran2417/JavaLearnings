package collectionss;

import java.util.*;

public class CollectionExample2 {

    public static void main(String[] args) {

        Set<String> set=new HashSet<>();//set does not allow duplicate values

        set.add("Aravind");
        set.add("Bharath");
        set.add("Aravind");
        set.add("kiruba");
        System.out.println("Set: "+set);

        set.remove("Aravind");//removes Aravind by value
        set.clear();//clears the set

        System.out.println("Size: "+set.size());

        System.out.println("Contains 'Aravind': "+set.contains("Aravind"));//returns true or false

        //set to list
        List<String> list=new ArrayList<>(set);//converts set to list

    }
}
