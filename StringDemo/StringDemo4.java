package StringDemo;

public class StringDemo4 {
    public static void main(String[] args) {
        String s="JAVA";
        System.out.println(s);

        char []data = s.toCharArray();

        for(int a=0 ; a<data.length ; a++){
            System.out.print(data[a]);
        }
    }
}
