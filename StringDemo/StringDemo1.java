package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "PUNE";
        String s2 = "MUMBAI";
        String s3 = "PUNE";

        String str1 = new String("Mumbai");
        String str2 = new String("PUNE");
        String str3 = new String("PUNE");

        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1 == str1);//false
        System.out.println(s1.equals(str2));//true
        System.out.println(str2 == str3);//false
        System.out.println(s2.equals(str1));//false
        System.out.println(s2.equalsIgnoreCase(str1));//true
    }
}
