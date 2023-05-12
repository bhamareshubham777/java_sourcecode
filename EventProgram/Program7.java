package EventProgram;

public class Program7 {
    public static void main(String[] args) {
        String str="QSPIDERS HADAPSAR TECHNO EVENT";
        String []data=str.split(" ");
        for (String a : data){
            for (int i=0 ; i<a.length() ; i++){
                if (i%2!=0){
                    System.out.print(a.toLowerCase().charAt(i));
                }else
                    System.out.print(a.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
