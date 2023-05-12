package String;

public class ReverseCharString {
    public static void main(String[] args) {
        String str="good morning shubh";
        String revStr="";
        System.out.println(str);
        for (int i=str.length()-1 ; i>=0 ; i--){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
        String []arr = revStr.split(" ");
        for (int i=arr.length-1 ; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
