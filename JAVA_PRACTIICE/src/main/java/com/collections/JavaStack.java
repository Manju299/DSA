package com.collections;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){
        Stack<String> stk = new Stack<>();
        // Add element to the stack
        stk.push("item1");
        stk.push("item2");
        stk.push("item3");
        stk.push("item4");
        System.out.println("Stack" +stk);

        System.out.println(stk.peek()); // to view the top element
        System.out.println(stk.pop()); // to view the removed element
        System.out.println(stk.empty());
        System.out.println(stk.removeAll(stk));
        System.out.println(stk.empty());

    }
}
