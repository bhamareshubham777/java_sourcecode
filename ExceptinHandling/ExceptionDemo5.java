package ExceptinHandling;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        Object []data = new String[2];
        try {
            data[0] = "java";
            data[1] = 50;
        }catch(ArrayStoreException e){
            System.out.println(e);
        }
        System.out.println("PROGRAM ENDED");
    }
}
