package mostasked.com;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] number = {1, 2,2,3,4,5,4};
        Set<Integer> unique = new HashSet<>();
        for(int num: number){
            unique.add(num);
        }
        System.out.println(unique);
    }


}
