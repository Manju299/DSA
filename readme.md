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

###### 1. Prime Number
```java
package org.example;

public class PrimeNumber {
    public static boolean prime_number(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }
        public static void main (String[] args){
            int n = 4;
            if (prime_number(n)){
                System.out.println("Prime number");
            }
            else {
                System.out.println(("Not prime number"));
            }
        }
    }

```
###### 2. Factorial
```java
package org.example;

public class Factorial {
    public static long factorial(Long n){
        if(n==1){
            return n;
        }
        return (n * factorial(n-1));
    }
    public static void main(String[] args){

        System.out.println(factorial(30L));
    }
}

```
###### 3. Frequency of the String
```java
package org.example;
import java.util.HashMap;
public class FrequencyOfStringChar {
   // Write a Java Program to find the duplicates of a given String.
   // Write a Java Program to count the number of characters in a given String.
    public static void getFrequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        char[] arr = str.toCharArray();

        for (char c: arr){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
//      get only repeated char
        for(char c:arr){
            if (map.get(c)>1){
                map1.put(c, map.get(c));
            }
        }

//        // to remove the duplicates from the map
//        for(char c:arr){
////            if (map.get(c)>1){
////                map.remove(c);
////            }
//            System.out.println(map.get(c));
//        }

        System.out.println(map);
    }
    public static void main(String[] args) {
        getFrequency("RandomStringForDuplicateCharCheck");
        getFrequency("The lazy fox jump over the quick brown dog ");
    }
}

```

###### 4. Armstrong Number
```java
package org.example;

import java.util.Scanner;

//Write a Java Program to check if a number is Armstrong number or not.
public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 9;
        int actualno = num;
        double result = 0;

        if (num < 10){
            result = -1;
        }else {
        while (actualno!=0){
            int n = actualno%10;
            result = result + Math.pow(n,3);
            actualno = actualno/10;
        }}

        if (result==num){
            System.out.println("Given number is armstrong");
        }else {
            System.out.println("Not an Armstrong number");
        }
        System.out.println(result);

    }
}

```

##### Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
```java
package org.example;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "a2b3c4";
        for (int i=0;i<str.length();i++){
            if (Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }else{
                int num = Character.getNumericValue(str.charAt(i));
                for (int j=1;j<num;j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}

```



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
### Priority Queue
```java
package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPQ {
        public static void main(String[] args){
            Queue<Integer> pq = new PriorityQueue<>();
            pq.offer(40);
            pq.offer(34);
            pq.offer(12);
            pq.offer(98);

            System.out.println(pq);
            System.out.println(pq.poll());
            System.out.println(pq.peek());
            System.out.println();
            pq.add(11);
            pq.offer(12);
            System.out.println(pq);
        }
}

```

### Array Deque
``` java
package com.collections;

import java.util.ArrayDeque;

public class JavaArrDeQ {
public static  void main(String[] args){
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    adq.offer(1);
    adq.offer(2);
    adq.offer(3);

    adq.offerFirst(4);
    adq.offerLast(5);
    System.out.println(adq);
//    System.out.println(adq.poll());

    System.out.println(adq.peek());
    System.out.println(adq.peekFirst());
    System.out.println(adq.peekLast());

    System.out.println(adq.pollFirst());
    System.out.println(adq.poll());
    System.out.println(adq.pollLast());
    System.out.println(adq);
}
}
```

## Set
### HashSet: Random Order
```java
package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaHashSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        System.out.println(set.remove(4));
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}

```

### LinkedHashSet: Ascending order
```java
package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();  // LinkedHashSet maintains the insertion order and return it
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        System.out.println(set.remove(4));
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
```
### Tree Set : In Sorted Order

```java
package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // Tree return the elements in sorted order
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        System.out.println(set.remove(4));
        System.out.println(set.contains(2));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}


```




##  Exception 
Def: Exception is an abnormal event which occurs at  run which will distturb the normal flow 
of program execution and terminates your program abruptly.

#### How to handle exceptions
By using try - catch block
By using throws" clause.

1. Checked Exception
2. Unchecked Exception




