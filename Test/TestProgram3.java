package Test;

import java.util.Scanner;

public class TestProgram3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER STRING");
        String str = sc1.next();

        char []data= str.toCharArray();
        char ch1 = data[0],ch2=data[data.length-1];

        String newstr = str.substring(1,str.length()-1);
        System.out.println(ch2+newstr+ch1);
    }
}
