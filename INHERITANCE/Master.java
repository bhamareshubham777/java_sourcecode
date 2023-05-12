package INHERITANCE;

public class Master {
    public Master(int a) {
        System.out.println(a);
    }
    public Master(String str) {
        this(777);
        System.out.println(str);
    }
    public Master(char ch) {
        this("SHUBH");
        System.out.println(ch);
    }
}
