package oops;

public abstract class Shape {

    /*Abstract class Shape
    - Implements the common method setColor.
    - Declares a abstract method (protocol) calculateArea  for sub class to implement.
    */

    public void setColor(String color){
        System.out.println("Color is "+color);
    }

    public abstract void calculateArea();

}
