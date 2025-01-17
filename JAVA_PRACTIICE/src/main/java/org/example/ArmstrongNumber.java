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
