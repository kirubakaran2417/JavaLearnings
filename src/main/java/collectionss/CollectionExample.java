package collectionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        //List example(Allow duplicate values,maintains insertion order)
        List<String> list=new ArrayList<>();
        list.add("Aravind");
        list.add("Bharath");
        list.add("Aravind");
        list.add("kiruba");
        System.out.println("List: "+list);

        //adding,removing,updating,retrieving
        list.add(1,"Ravi");
        System.out.println("List: "+list);
        list.set(1,"Annadurai");
        System.out.println("List: "+list);

        //removing
        list.remove(1);//removes Annadurai by index
        System.out.println("List: "+list);
        list.remove("Aravind");//removes Ravi by value

        //size
        System.out.println("Size: "+list.size());

        //contains
        System.out.println("Contains 'Aravind': "+list.contains("Aravind"));

        //list.indexOf()
        System.out.println("Index of 'Aravind': "+list.indexOf("Aravind"));

        //list.lastIndexOf()
        System.out.println("Last Index of 'Aravind': "+list.lastIndexOf("Aravind"));

        Collections.sort(list);
        System.out.println("Sorted List: "+list);

        List<String> list2=list.subList(1,3);
        System.out.println("Sublist: "+list2);

        System.out.println(list.get(1));

        //loop to delete exact element
        for(int i=0;i<list.size();i++) {
            if (list.get(i).equals("Aravind")) {
                list.remove(i);
            }
        }

    }
}
