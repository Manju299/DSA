class StackNode {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

class Stack {
  constructor() {
    this.top = null;
    this.size = 0;
  }

  push(val) {
    if (this.size === 0) {
      this.top = new StackNode(val);
    } else {
      const pushedNode = new StackNode(val);
      pushedNode.next = this.top; // to Point current node top previous node
      this.top = pushedNode;
    }
    this.size++;
  }

  pop() {
    if (this.size === 0) return null;
    const popednode = this.top; //
    this.top = this.top.next; // Point next node as top node.
    this.size--;
    return popednode.val;
  }

  getTop() {
    return this.top.val;
  }
}

let myStack = new Stack();
myStack.push(1);
myStack.push(2);
myStack.push(3);
myStack.push(4);

console.log("Current top", myStack.getTop());
console.log(myStack.size);

myStack.pop();
console.log("Current top", myStack.getTop());
console.log(myStack.size);
