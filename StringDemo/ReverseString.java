package StringDemo;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str="vishwajit somwanshi";
        String revstr="";
        String revstr2="";
        String data[]=str.split(" ");
        for (int b=0;b<data.length;b++)
        {
            for (int a=data[b].length()-1;a>=0;a--)
            {
                revstr=revstr+data[0].charAt(a);
                revstr2=revstr2+data[1].charAt(a);
            }
        }
        System.out.println(revstr+" "+revstr2);

    }
}
