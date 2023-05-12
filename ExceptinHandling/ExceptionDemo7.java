package ExceptinHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        String msg="I AM A GOOD DEVELOPER";
        FileWriter fw=null;
        try {
            fw = new FileWriter("info.txt");
            fw.write(msg);
            System.out.println("FILE CREATED SUCCESSFULLY");
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
