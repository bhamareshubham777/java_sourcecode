package SinglyLinkLedist;

public class DeleteLast {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
         if (head==null){
             head=newNode;
             tail=newNode;
         }else {
             newNode.next=head;
             head=newNode;
         }
    }

    public void deleteLast(){
        if (head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }else {
            if (head!=tail){
                Node current=head;
                while (current.next!=tail){
                    current=current.next;
                }
                tail=current;
                tail.next=null;
            }else {
                head=tail=null;
            }
        }
    }

    public void display(){
        Node current =head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteLast list=new DeleteLast();
          list.addNode(11);
//        list.addNode(21);
//        list.addNode(51);
        list.display();
        list.deleteLast();
        list.display();
    }
}
