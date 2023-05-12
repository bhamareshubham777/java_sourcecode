package Array;

public class StudentClonning implements Cloneable{
    int rollNo;
    String name;

    public StudentClonning(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Main{
    public static void main(String[] args) {
        try {
            StudentClonning s1=new StudentClonning(11,"SHUBH");
            StudentClonning s2=(StudentClonning)s1.clone();
            System.out.println(s1.rollNo);
            System.out.println(s1.name);
            System.out.println(s2.rollNo);
            System.out.println(s2.name);
        }catch (CloneNotSupportedException c){

        }

    }
}
