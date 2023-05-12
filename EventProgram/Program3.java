package EventProgram;

public class Program3 {
    public static void main(String[] args) {
        String str="QSPIDERS";
        String newStr1="";
        String newStr2="";

        for (int i=1 ; i<=str.length() ; i++){
            newStr1 = str.substring(i);
            newStr2 = str.substring(0,i);
            System.out.print(newStr1+newStr2+" ");
        }
    }
}
