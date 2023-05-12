package SinglyLinkLedist;

public class InsertLast {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;

    public void insertLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertLast list=new InsertLast();
        list.insertLast(11);
        list.display();
        list.insertLast(21);
        list.display();
        list.insertLast(51);
        list.display();
    }
}
