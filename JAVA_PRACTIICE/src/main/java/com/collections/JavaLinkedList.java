package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JavaLinkedList {
    public static void main(String[] args){
        //Linked List Using Queue
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.element()); // Throws exception when empty
        q.add(3);  // Throws execption
        q.remove(); // Throws exception


        //Linked List Using List Interface
        List<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(222);
        li.add(333);

        System.out.println(li.size());
        System.out.println(li.remove(1));
        System.out.println(li.get(1));
    }
}
