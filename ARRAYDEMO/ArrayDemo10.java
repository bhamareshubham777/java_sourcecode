package ARRAYDEMO;

public class ArrayDemo10 {
    public static void main(String[] args) {
            char []data = takeArray();

            for(int a=0; a<data.length; a++){
                System.out.print(data[a]);
            }

    }
            static char[] takeArray(){
                char []arr = new char[4];
                arr[0] = 'J';
                arr[1] = 'A';
                arr[2] = 'V';
                arr[3] = 'A';

                return arr;
            }
}
