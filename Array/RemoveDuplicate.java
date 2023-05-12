package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int []data = {11,21,21,31,41,11,31,51};
        int l1 = data.length;
        int []temp = new int[l1];
        int count=0,i,j;

        for (i=0 ; i<l1 ; i++){
            for (j=0 ; j<count ; j++){
                if (data[i]==data[j]){
                    break;
                }
            }
            if (count==j){
               temp[count++]=data[i];
            }
        }
        for (int a=0 ; a<count ; a++){
            System.out.print(temp[a]+" ");
        }
    }
}
