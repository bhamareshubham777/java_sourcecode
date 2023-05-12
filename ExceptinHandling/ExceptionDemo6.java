package ExceptinHandling;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        String str="JAVA";
        try {
            System.out.println("TRY STARTED");
            System.out.println(str.length());
            System.out.println("TRY ENDED");
        }catch(NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("CLOSED COSTLY RESOURCES");
        }
        System.out.println("PROGRAM ENDED");
    }
}
