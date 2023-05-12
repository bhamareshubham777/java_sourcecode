package ARRAYDEMO;

public class ArrayDemo13 {
    public static void main(String[] args) {
        String [][]states = new String[3][2];

        states[0][0] = "MAHARASHTRA";
        states[0][1] = "MUMBAI";
        states[1][0] = "GOA";
        states[1][1] = "PANAJI";
        states[2][0] = "TELANGANA";
        states[2][1] = "HAIDRABAD";

        for(int a=0; a<states.length; a++){
            for(int b=0; b< states.length-1; b++){
                System.out.print(states[a][b]+"\t");
            }
            System.out.println();
        }
    }
}
