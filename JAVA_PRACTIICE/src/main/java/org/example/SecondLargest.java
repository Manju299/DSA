package org.example;

import java.util.Scanner;

public class SecondLargest {
    // Given an array of positive integers arr[], return the second largest element from the array.
    // If the second largest element doesn't exist then return -1.
//    Input: arr[] = [12, 35, 1, 10, 34, 1]
//    Output: 34
//    Explanation: The largest element of the array is 35 and the second largest element is 34.
//    public static int SecondLargestNumber(int[] arr, int n){
//        int largest = Integer.MIN_VALUE;
//        int second_largest = Integer.MIN_VALUE;
//        if (n < 2){
//            return -1;
//        }
//        for (int i=0; i<n; i++){
//            if (arr[i]>largest){
//                second_largest = largest;
//                largest = arr[i];
//            }
//            else if(arr[i] > second_largest && arr[i]<largest){
//                second_largest = arr[i];
//            }
//        }
//        return  (second_largest==Integer.MIN_VALUE)? -1: second_largest;
//    }

    //print Start console usingn loop


    public static void main(String[] args){
//        int arr[] = {12, 35, 1, 10, 34, 1};
//        int n = arr.length;
////        System.out.println(SecondLargestNumber(arr, n));
//        for (int i=1; i<5;i++){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number" );
        try {
            while ((n = input.nextInt()) != 0){
                System.out.print("You entered" +n);

            }
        }
        catch (Exception e){
            System.out.println("You can only enter number and max " +Integer.MAX_VALUE +e);
        }

    }
}
