package SinglyLinkLedist;

public class DeleteFirst {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    Node head=null;
    Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void deleteFirst(){
        if (head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }else{
            if (head!=tail){
                head=head.next;
            }else {
                head=tail=null;
            }
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
        DeleteFirst list=new DeleteFirst();
//        list.addNode(11);
//        list.addNode(21);
//        list.addNode(51);
        list.display();
        list.deleteFirst();
        list.display();
    }
}
