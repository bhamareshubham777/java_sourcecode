package StringProgram;

public class SplitString {
    public static void main(String[] args) {
        String str="13:5";

        String []arr=str.split(":");

        for (String a : arr){
            String newStr=a.toLowerCase().charAt(0)+a.substring(1);
            System.out.println(newStr);
        }
    }
}
