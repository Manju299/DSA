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
