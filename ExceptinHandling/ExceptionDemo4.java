package ExceptinHandling;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        int []arr=new int [3];
        String str=null;
        try {
            try {
                arr[0] = 10;
                arr[3] = 20;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println(str.toLowerCase());
        }catch (NullPointerException i){
            System.out.println(i);
        }
        System.out.println("PROGRAM ENDED");
    }
}
