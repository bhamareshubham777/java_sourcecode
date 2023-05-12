package StringProgram;

public class ReplaceChar {
    public static void main(String[] args) {
        String str="PROGRAMMING";
        System.out.println(str);
        String newStr=str.replace('M','*');
        System.out.println(newStr);

        String str1=str.substring(0,str.length()-1);
        String str2=str.substring(str.length()-1);

        String resStr=str1+str2.toLowerCase();
        System.out.println(resStr);
    }
}
