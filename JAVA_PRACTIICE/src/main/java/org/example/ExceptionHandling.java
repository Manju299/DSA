package org.example;

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
