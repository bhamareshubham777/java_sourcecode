package String;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1="ARMY";
        String str2="MARY";

        if (str1.length()==str2.length()){
            char []data1=str1.toCharArray();
            char []data2=str2.toCharArray();

            Arrays.sort(data1);
            Arrays.sort(data2);

            boolean status=true;

            for (int i=0 ; i< data1.length ; i++){

                    if (data1[i]!=data2[i]){
                        status=false;
                    }

            }
            if (status){
                System.out.println("STRING IS ANAGRAM");
            }else{
                System.out.println("NOT ANAGRAM");
            }
        }
    }
}
