package org.example;
import java.util.Scanner;
public class CheckPallindrome {
    public static void main(String[] args){
        String original, reverse="";
        Scanner sc = new Scanner(System.in);
        original= sc.nextLine();
        int lenght= original.length();
        for (int i=0;i<lenght; i++){
            reverse = original.charAt(i) + reverse;
        }
        if (original.equals(reverse)){
            System.out.println("Given String is a pallidrome");
        }
        else {
            System.out.println("Given String is not a pallindrome");
        }
    }
}
