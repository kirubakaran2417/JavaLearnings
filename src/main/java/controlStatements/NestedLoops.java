package controlStatements;

public class NestedLoops {

    public static void main(String[] args) {

        /*
        00
        01
        02
        10
        11
        12
        20
        21
        22
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "" + j);
            }
        }
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print( j);
//            }
//            System.out.println();
//        }

    }
}
