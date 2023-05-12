package EventProgram;

public class Program5 {
    public static void main(String[] args) {
        String str="QSPIDERS HADAPSAR TECHNO EVENT";

        char []arr=str.toCharArray();

        for (int i=0 ; i<arr.length ; i++){
            if (i%2!=0){
                System.out.print(Character.toLowerCase(arr[i]));
            }else{
                System.out.print(arr[i]);
            }
        }
    }
}
