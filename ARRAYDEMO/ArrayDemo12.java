package ARRAYDEMO;

public class ArrayDemo12 {
    public static void main(String[] args) {
        int [][]data;

        data = new int[2][2];

        data[0][0] = 100;
        data[0][1] = 200;
        data[1][0] = 300;
        data[1][1] = 400;

        for(int a=0; a<data.length; a++){
            for(int b=0; b< data.length; b++){
                System.out.print(data[a][b]+"\t");
            }
            System.out.println();
        }
    }
}
