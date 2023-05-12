package String;

public class PrintDuplicate3 {
    public static void main(String[] args) {
        String str="shubham bhamare";
        char[]data=str.toCharArray();

        for (int i=0 ; i<data.length ; i++){
            int count=1;
            for (int j=i+1 ; j<data.length ; j++){
                if (data[i]==data[j]){
                    count++;
                    data[j]='0';
                }
            }
            if (count>1 && data[i] != '0'){
                System.out.println(data[i]);
            }
        }
    }
}
