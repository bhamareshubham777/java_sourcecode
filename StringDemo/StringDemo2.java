package StringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "CORE";
        String s2 = "CORE";

        System.out.println(s1 == s2);//true

        s1 = s1+"JAVA";
        System.out.println(s1 == s2);//false
    }
}
