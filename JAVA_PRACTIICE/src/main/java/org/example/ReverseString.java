package org.example;

public class ReverseString {
    public static void main(String args[]){
        String str = "hello";
        String rev = "";
        for (int i=0; i<str.length(); i++){
            // this approch creates new string object and its inefficient
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);

        //Efficient one
        StringBuilder reverse = new StringBuilder();
        for (int i=0;i<str.length();i++){
            reverse.insert(0, str.charAt(i));
        }
        System.out.println(rev.toString());
    }
}
