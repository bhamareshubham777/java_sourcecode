package ExceptinHandling;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        String str=null;
        try {
            System.out.println(str.toLowerCase());
        }catch(NullPointerException e){
            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}
