package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class StringHashset {
    public static void main(String[] args) {
        Set<Character> hs1 = new HashSet<>();
        String str="CORE JAVA PROGRAMMING";

        for (int i=0 ; i<str.length() ; i++){
            hs1.add(str.charAt(i));
        }

        for (Character a: hs1){
            int count=0;
            for (int i=0 ; i<str.length() ; i++){
                if (a==str.charAt(i)){
                    count++;
                }
            }
            System.out.println(a+" --> "+count);
        }
    }
}
