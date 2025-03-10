package org.example;

public class CountCapitalLetters {
    static void getCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) > 65 && str.charAt(i) < 99){
                count = count+1;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str = "HelloW";
        getCount(str);
    }
}
