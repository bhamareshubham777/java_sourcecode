package String;

import java.lang.*;

class A{
    int xyz=25;
}
class B extends A{
    int xyz=15;
}
class Main {
    public static void main(String args[]) {
       A a=new B();
        System.out.println(a.xyz);
    }
}
