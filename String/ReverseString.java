package String;

public class ReverseString {
    public static void main(String[] args) {
        String str="Nitin";
        String newStr=str.toLowerCase();
        String revStr="";

        for (int i=newStr.length()-1 ; i>=0 ; i--){
            revStr=revStr + newStr.charAt(i);
        }
        System.out.println(revStr);
        if (newStr.equals(revStr)){
            System.out.println("String is Pallindrome");
        }
    }
}
