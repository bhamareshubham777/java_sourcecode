package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileWriter fw = null;

        try {
            fw=new FileWriter("C:\\Resume\\Demo.properties");
            prop.setProperty("Shubh","bhamare");
            prop.setProperty("gaja", "Niwanya");
            prop.store(fw,"first file");
            System.out.println("FILE SUCCEFULLY CREATED");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
