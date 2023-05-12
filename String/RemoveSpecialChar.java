package String;

public class RemoveSpecialChar {
    public static void main(String[] args) {
            String str="Progr@mmi#ng Langu/age";

            for (int i=0 ; i<str.length() ; i++){
                //if (str.charAt(i) != '@' && str.charAt(i) != '#' && str.charAt(i) != '/')
                if ((str.charAt(i)>='A' &&  str.charAt(i)<='Z') || ( str.charAt(i)>='a' && str.charAt(i)<='z')){
                    System.out.print(str.charAt(i));
                }
            }
    }
}
