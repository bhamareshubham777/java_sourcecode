package StringProgram;

public class BracketsValid {
    public static void main(String[] args) {
        String str = "(){}[]";
        boolean status=true;
        if (str.length()%2==0){
            char arr[]=str.toCharArray();

            for (int i=1 ; i<arr.length ; i+=2) {
                int diff = arr[i] - arr[i - 1];
                if (!(diff < 3 && diff > 0)) {
                    status = false;
                }
            }
            if (status){
                System.out.println("BRACKETS ARE VALID");
            }else{
                System.out.println("BRACKETS ARE NOT VALID");
            }
        }else {
            System.out.println("String is not valid");
        }
    }
}
