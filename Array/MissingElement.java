package Array;
class Demo{
    private int a=4;
    private int b=1;

    void display(int a,int b)
    {
        this.a=a+b;
        System.out.println(this.a);
    }
}
public class MissingElement {
    public static void main(String[] args) {

//        Demo d=new Demo();
//        d.display(5,3);
        int []arr={2,4,8,10};

        int diff=arr[0];

        for (int i=0 ; i<arr.length-1 ; i++){

           /* if (arr[i]-i != diff){

                while (diff < arr[i]-i){
                    System.out.print(i+diff+" ");
                    diff++;
                }
            }*/

           if (arr[i]+2 != arr[i+1]){
                System.out.print(arr[i]+2);
            }
        }
    }
}
