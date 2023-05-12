package ExceptinHandling;

import java.io.IOException;

public class ExceptionDemo11 {
    static void test()throws IOException {
        throw new IOException();
    }
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        try{
            test();
        }catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("MAIN ENDED");
    }
}
