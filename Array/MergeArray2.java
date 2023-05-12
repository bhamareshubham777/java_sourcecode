package Array;

public class MergeArray2 {
    public static void main(String[] args) {
        int []arr1={10,30,50};
        int []arr2={20,40,60,70,80,90};
        int l1=arr1.length;
        int l2=arr2.length;
        int []res=new int[l1+l2];
        int index=0, i=0, j=0;

        while (i<l1 && j<l2){
            res[index++] = arr1[i++];
            res[index++] = arr2[j++];
        }

        while (j<l2){
            res[index++] = arr2[j++];
        }

        for (int a : res){
            System.out.print(a+" ");
        }
    }
}
