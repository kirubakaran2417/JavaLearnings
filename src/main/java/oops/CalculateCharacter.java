package oops;

public class CalculateCharacter {

    public static void main(String[] args) {
        String s="kirubakaran";
        System.out.println(s.length());//11

        System.out.println(s.indexOf('a'));//5
        System.out.println(s.charAt(5));//a

        //calculate total number of 'a' in s
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Total number of 'a' in s is "+count);
    }
}
