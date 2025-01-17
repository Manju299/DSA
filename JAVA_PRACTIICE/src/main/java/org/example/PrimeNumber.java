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
