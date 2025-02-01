package basics;


import java.util.Scanner;

public class ReadinputfromConsole {
    /*
         Scanner-it is a class which is used to take input from console
         nextInt()-it is used to take integer input
         nextFloat()-it is used to take float input
         nextDouble()-it is used to take double input
         next()-it is used to take string input
         nextLine()-it is used to take next line
          */
    public static void main(String[] args) {

        System.out.println("Enter the value of A:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("the value of A is "+a);
    }
}
