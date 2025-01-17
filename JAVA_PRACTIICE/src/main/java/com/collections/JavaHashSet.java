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
