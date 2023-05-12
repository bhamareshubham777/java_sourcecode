package Number;

public class FactRecursion {
    public static void main(String[] args) {
        int res=new FactRecursion().factorial();
        System.out.println(res);
    }
    int a=1,fact=1,num=6;

    int factorial()
    {

        if(a<num){
            fact=fact*a;
            a++;
            factorial();
        }
        return fact;
    }
}
