package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Check if a Number is Positive or Negative in Java
//        int n = 5;
//        if (n > 0){
//            System.out.println("The given number is positive");
//        }
//        else {
//            System.out.println("The give number is negatvie");
//        }

        // Finding larges in an array
//        int arr[] = { 3,5 ,2,8,5,6,1};
//        int max = arr[0];
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>max)
//                max = arr[i];
//        }
//        System.out.println(max);


        // findinf the smallest of the given array
        int arr[] = { 34,44,35,12,23,78,67};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}