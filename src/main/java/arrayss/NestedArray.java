package arrayss;

public class NestedArray {

    public static void main(String[] args) {

        int[][] arr={
            {1,2,3},{6,7,8},{11,12,13}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
