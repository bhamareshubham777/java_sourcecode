package StringDemo;

public class StringDemo6 {
    public static void main(String[] args) {
        String s= "SQL WT JAVA";
       // System.out.println(s);
        String []data = s.split(" ");
        for (int a=0 ; a< data.length ; a++){
            System.out.println(data[a]);
        }
    }
}
