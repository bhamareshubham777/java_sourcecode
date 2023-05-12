package ExceptinHandling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        String str = "123abc";

        try {
            int no = Integer.parseInt(str);
            System.out.println(no);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}
