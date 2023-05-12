package String;

public class RecursionCountVowels {
    public static void main(String[] args) {
        String str="shubh bhamare";
        int n=str.length();
        countVowels(str,n);
    }
    static void countVowels(String str,int n){
        int countV=0;
        int countC=0;
        if (n>=0){
            for (int i=0 ; i<str.length() ; i++){
                if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                    countV++;
                }else{
                    countC++;
                }
            }
            n--;
            countVowels(str,n);
        }
        System.out.println("Vowels are: "+countV);
        System.out.println("Consonents are: "+countC);
    }
}
