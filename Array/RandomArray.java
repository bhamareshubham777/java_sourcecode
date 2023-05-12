package Array;

import java.util.Random;

public class RandomArray {
        static Random rand = new Random();

        static int[] randomArr(int n){
            int []arr=new int[n];

            for (int i=0 ; i<n ; i++){
                arr[i]= rand.nextInt(20);
            }

            return arr;
        }
    }

