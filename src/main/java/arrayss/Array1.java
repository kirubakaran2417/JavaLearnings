package arrayss;

public class Array1 {

    //array-collection of silimilar data type elements
    //array size is fixed
    //index starts from 0
    //array elements are accessed using index

    public static void main(String[] args) {
        //array declaration and initialization
        //datatype[] arrayname;-->declaration
        //arrayname=new datatype[size];-->initialization
        int[] marks=new int[5];
        //add elements
        marks[0]=45;
        marks[1]=67;
        marks[2]=89;
        marks[3]=85;
        marks[4]=92;

        int[] marks2={45,67,89,85,92,56};
        System.out.println("marks2 array length is "+marks2.length);
        for (int i=0;i<marks2.length;i++){
            System.out.println(marks2[i]);
        }
        int[] marks3={45,67,89,85,92,56,75,95};
        for(int i=60;i>60;i++){
            System.out.println("the values greater than 60");
        }
    }
}
