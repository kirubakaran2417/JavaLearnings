package basics;

public class Calcaulation3 {

    int maths;
    int science;

    public Calcaulation3(){
        maths=30;
        science=40;
    }

    public static void main(String[] args) {

        Calcaulation3 cal=new Calcaulation3();
        System.out.println("The total is "+(cal.maths+cal.science));
    }

}
