package nutanix1;

public class LinkedListImplementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        traverseList(head);
    }

 public static void traverseList(Node head){
        while (head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
     System.out.println("null");
 }
}

//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}


