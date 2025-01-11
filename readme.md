# Java Programs

#### 1 Write a program to reverse the Given String
``` Java
public class ReverseString {
public static void main(String args[]){
String str = "hello";
String rev = "";
for (int i=0; i<str.length(); i++){
//This approach creates a new string object and it is inefficient
rev = str.charAt(i) + rev;
}
System.out.println(rev);

        //Efficient one
        StringBuilder reverse = new StringBuilder();
        for (int i=0;i<str.length();i++){
            reverse.insert(0, str.charAt(i));
        }
        System.out.println(rev.toString());
    }
}
```

#### 2 Write a program to demonstrate the execption hadling in java

```Java
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args){
        float a, b, result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A ");
        a = s.nextFloat();
        System.out.println("Enter B ");
        b= s.nextFloat();
        try{
            result = a/b;
            System.out.println("This is the result " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught: Division by zero");
        }
    }
}
```
### Most frequently asked question in Java Interview

##### Prime Number
##### Factorial
##### Pattern printing
##### Binary search
##### Bubble sort
##### Sum of number in given input
##### Display double words in given String
##### Print Second largest



# JAVA COLLECTION FRAMEWORK
### Arraylist
```java
package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Manjunath");
        list.add("Kumar");
        list.add("sridhar");
        list.add("Srikant");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.add("Sagar");
        list1.add("viru");
        System.out.println(list1);

        // remove items from the array list
        list1.remove(1);  // This is index based
        System.out.println(list1);
        list1.remove(String.valueOf("Sagar")); // Values based
        System.out.println(list1);

        // iteration throung the array list
        //Ussing for loop

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // Using for each loop
        for(String ele: list){
            System.out.println(ele);
        }

        //Using Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Using Iterator" +it.next());
        }
    }
}
```

### Stack
````java
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

````

### Linked List 
```java
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

```