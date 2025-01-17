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
