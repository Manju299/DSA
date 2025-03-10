package org.example;

public class SumOfGivenInterger {
    public static int sumOfInt(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfInt(1234));
    }
}
