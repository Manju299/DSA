var head;
class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

function printLL(){
    n = head;
    while (n!=null){
        console.log(n.data+" ");
        n = n.next;
    }
}

head =  new Node(1);
var second = new Node(2);
var third = new Node(3);

head.next = second;
second.next = third;



console.log(printLL());