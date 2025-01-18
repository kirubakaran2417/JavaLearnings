package basics;

public class Car {

    //attributes-variables
    String brand;
    String colour;
    double speed;

    //methods
    public void accelerate(){
        System.out.println("Acceleration is happening");
    }
    public void capacity(){
        System.out.println("25 bhp");
    }

    public static void main(String[] args) {

        Car car1=new Car();//obj1
        car1.brand="BMW";
        car1.colour="Black";
        car1.speed=200;
        car1.accelerate();
        car1.capacity();

    }
}
