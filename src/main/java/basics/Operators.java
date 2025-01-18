package basics;

import java.sql.SQLOutput;

public class Operators {


    public static void main(String[] args) {
        //Arithmetic operators
        //+,-,*,/,%
        System.out.println(5+5);//10
        System.out.println(5-5);//0
        System.out.println(5*5);//25
        System.out.println(5/5);//this will give Quotient
        System.out.println(5%2);//this will give remainder
        //relational operators
        //>,<,>=,<=,==,!=
        System.out.println(5>5);//false
        System.out.println(5<5);//false
        System.out.println(5>=5);//true
        System.out.println(5<=5);//true
        System.out.println(5==5);//true
        System.out.println(5!=5);//false
        //logical operators
        //&&,||,!
        System.out.println(5>4 && 5<6);//true
        System.out.println(5>4 || 5<6);//true

    }
}
