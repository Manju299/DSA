package mostasked.com;

import java.util.HashSet;

public class RemoveDuplicatesFromStringArray {
    public static void main(String[] args) {
        String[] strArray = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
//1. Using Brute Force Method
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if ((strArray[i] == (strArray[j]))) {
                    System.out.println("Brute Force Method : Duplicate Element is : " + strArray[j]);
                }
            }
        }
        // using Hashset
        HashSet<String> hs = new HashSet<String>();
        for (String arrayElement : strArray) {
            if (!hs.add(arrayElement)) {
                System.out.println("HashSet :Duplicate Element is : " + arrayElement);
            }
        }
    }
}
