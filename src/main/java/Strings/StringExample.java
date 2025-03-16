package Strings;

public class StringExample {

    public static void main(String[] args) {

        String name="Aravind";

        String name2="Aravind";

        String name3=new String("Aravind");

        System.out.println(name==name2);//this is comparing memory address
        System.out.println(name.equals(name3));//this is comparing value

        //string is immutable

        //String methods

        System.out.println(name.length());
        //searching
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', 2));
        System.out.println(name.indexOf("av", 2));
        System.out.println(name.lastIndexOf('a'));
        //substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        //replace
        System.out.println(name.replace('a','e'));
        //split
        System.out.println(name.split("a"));

    }
}
