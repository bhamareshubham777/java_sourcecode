package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users//LaxmE//OneDrive//Desktop//Demo.txt");
        try {
            if (file.createNewFile()){
                System.out.println("FILE CREATED SUCCESSFULLY!!! "+file.getName());
            }else{
                System.out.println("FILE ALREADY EXISTS");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw = new FileWriter(file);
            String msg = "I LOVE MY INDIA";
            fw.write(msg);
            fw.close();
            System.out.println("WROTE SUCCESSFULLY");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(file.getAbsoluteFile());
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

       if (file.delete()){
            System.out.println("FILE DELETED SUCCESSFULLY");
        }else{
            System.out.println("ERROR");
        }
    }
}
