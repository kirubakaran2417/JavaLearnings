package Strings;

public class StringBuffers {

    //StringBuffers are mutable ,it can be changed

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" Aravind");
        System.out.println(sb);
        sb.insert(5," bharath");
        System.out.println(sb);
        //delete bharath
        sb.delete(5,13);
        System.out.println(sb);
    }
}
