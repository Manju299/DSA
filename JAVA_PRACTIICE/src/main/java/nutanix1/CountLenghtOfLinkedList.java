package nutanix1;

public class CountLenghtOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(20);
        lenghtOfList(head);
    }

    public static void lenghtOfList(Node head){
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }

        System.out.println(count);
    }
}
