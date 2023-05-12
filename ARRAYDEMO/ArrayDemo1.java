package ARRAYDEMO;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int []data;
        data = new int[5];
        data[0]=100;
        data[1]=200;
        data[2]=300;
        data[3]=400;
        data[4]=500;

        for(int a=0; a<5; a++){
            System.out.println(data[a]);
        }
    }
}
