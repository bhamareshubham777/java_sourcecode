package StringProgram;

public class PallindromeString {
    public static void main(String[] args) {
        String str="nitin";
        String revStr="";

        for (int i=str.length()-1 ; i>=0 ; i--){
            revStr+=str.charAt(i);
        }
        if (str.equals(revStr)){
            System.out.println("String Pallindrome");
        }else{
            System.out.println("String not Pallindrome");
        }
    }
}
