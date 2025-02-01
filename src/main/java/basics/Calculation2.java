package basics;

public class Calculation2 {

    public static void main(String[] args) {
        int tamil=10,english=20,math=30,science=40,social=50;
        //we have to create object to call non static method
        //how to create object
        //class name object name(user defined)==new class name();
        Calculation2 calc=new Calculation2();
        //how to call a method?
        //object name.method name
        int total=calc.add(tamil,english,math,science,social);
        System.out.println("The total is "+total);
        double average=total/5.0;
        System.out.println("The average is "+average);
    }

    public static int add(int m1,int m2,int m3,int m4,int m5){
        return m1+m2+m3+m4+m5;
    }
}
