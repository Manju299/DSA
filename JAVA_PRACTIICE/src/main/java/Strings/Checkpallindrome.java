package Strings;

public class Checkpallindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = "";
        for (int i=0;i< str.length();i++){
            reverse = str.charAt(i) + reverse;
        }

        if (str.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }
}
