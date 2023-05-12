package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileReader fr = null;

        try {
            fr=new FileReader("C:\\Resume\\login.properties");
            prop.load(fr);
            String username=prop.getProperty("user");
            String password=prop.getProperty("password");
            System.out.println("USERNAME IS: "+username);
            System.out.println("PASSWORD IS: "+password);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
