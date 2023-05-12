package ARRAYDEMO;

public class ArrayDemo15 {
    public static void main(String[] args) {
        int [][][]data = new int[2][2][2];

        data[0][0][0] = 10;
        data[0][0][1] = 20;
        data[0][1][0] = 30;
        data[0][1][1] = 40;

        data[1][0][0] = 50;
        data[1][0][1] = 60;
        data[1][1][0] = 70;
        data[1][1][1] = 80;

        for(int a=0; a<data.length; a++){
            for(int b=0; b< data.length; b++){
                for(int c=0; c< data.length; c++){
                    System.out.print(data[a][b][c]+"\t");
                }
            }
        }
    }
}
