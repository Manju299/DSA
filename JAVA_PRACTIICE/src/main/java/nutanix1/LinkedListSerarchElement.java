package nutanix1;

public class LinkedListSerarchElement {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
       boolean result = searchForElementInList(head, 50);
       if (result){
           System.out.println("KeyFound");
       }
       else {
           System.out.println("Key Not Found");
       }
    }
    public static boolean searchForElementInList(Node head, int key){
        Node cur = head;
        while(cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
