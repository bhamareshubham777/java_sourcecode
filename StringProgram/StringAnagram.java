package StringProgram;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "CORE JAVA";
        String str2 = "JAVA CORE";

        int n1=str1.length();
        int n2=str2.length();
        if(n1==n2) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean status = true;
            for (int i=0 ; i<n1 ; i++){
                if (arr1[i]!=arr2[i]){
                    status=false;
                }
            }
            if (status){
                System.out.println("STRING IS ANAGRAM");
            }else{
                System.out.println("STRING IS NOT ANAGRAM");
            }
        }
    }
}
