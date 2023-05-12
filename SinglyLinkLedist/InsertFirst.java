package SinglyLinkLedist;

public class InsertFirst {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void insertFirst(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertFirst list=new InsertFirst();
        list.insertFirst(11);
        list.display();
        list.insertFirst(21);
        list.display();
        list.insertFirst(51);
        list.display();
    }
}
