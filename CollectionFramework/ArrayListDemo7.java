package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER START POINT");
        int start=sc.nextInt();
        System.out.println("ENTER END POINT");
        int end=sc.nextInt();

        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        for (int a=start ; a<=end ; a++){
            if(a%2==0){
                even.add(a);
            }else {
                odd.add(a);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
