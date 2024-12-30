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
