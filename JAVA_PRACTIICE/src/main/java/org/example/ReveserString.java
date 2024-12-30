package org.example;
import java.util.Scanner;
public class ReveserString {
    public static  void main(String[] args){
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        original = sc.nextLine();
        int length = original.length();
        for (int i=0; i<length; i++){
            reverse = original.charAt(i) + reverse;
        }
        System.out.println("Reverser String" + reverse);

        //Using the internal Java method
        StringBuffer a = new StringBuffer(original);
        System.out.println("Reversed Array using Inbuild mehtod " + a.reverse());
    }
}