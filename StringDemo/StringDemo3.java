package StringDemo;

public class StringDemo3 {
    public static void main(String[] args) {
        String str = "Software Developer";

        System.out.println(str.length());//18
        System.out.println(str.charAt(12));//e
        System.out.println(str.indexOf('w'));//4
        System.out.println(str.lastIndexOf('e'));//16
        System.out.println(str.contains("eve"));//true
        System.out.println(str.startsWith("Soft"));//true
        System.out.println(str.endsWith("per"));//true
        System.out.println(str.substring(9));//Developer
        System.out.println(str.substring(0,8));//Software
        System.out.println(str.toUpperCase());//SOFTWARE DEVELOPER
        System.out.println(str.toLowerCase());//software developer
    }
}
