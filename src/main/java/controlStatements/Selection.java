package controlStatements;

public class Selection {

    //if- it works when the condition is true
    //if else-it works when the condition is true or false
    //else if -it works when we have multiple conditions

    public static void main(String[] args) {
//            //   ||(or),&&(and),!(not)=>logical operators
//        int a=10;
//        int b=20;

//        if(a>b){
//            System.out.println("a is greater than b");
//        }else{
//            System.out.println("b is greater than a");
//        }

        int mark=95;
        if(mark>=90 && mark<=100){
            System.out.println("A grade");
        }else if(mark>=80 && mark>=90) {
            System.out.println("B grade");
        }else if(mark>=70 && mark>=80){
            System.out.println("C grade");
        }else{
            System.out.println("Fail");
        }
    }
}
