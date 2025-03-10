package mostasked.com;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "Hellow world";
        Map<Character, Integer> freq = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char c: arr){
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);
            }else {
                freq.put(c,1);
            }
        }
        System.out.println(freq);
    }
}



