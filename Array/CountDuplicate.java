package Array;

public class CountDuplicate {
    public static void main(String[] args) {
        int []arr={1,2,1,2,3,4,3,5,3};
        int []temp=new int[arr.length];

        for (int i=0 ; i<arr.length ; i++){
            int count=1;
            for (int j=i+1 ; j< arr.length ; j++){
                if (arr[i]==arr[j]){
                    count++;
                    temp[j]=-1;
                }
                if (temp[i] != -1){
                    temp[i]=count;
                }

            }
            /*if (count>1 && arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }*/
        }
       for (int i=0 ; i<arr.length ; i++){
            if (temp[i] != -1){
                System.out.println(arr[i]+" | "+temp[i]);
            }
        }
    }
}
