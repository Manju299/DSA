package arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveAllZerosToEnd(arr);
    }
    public static void moveAllZerosToEnd(int[] arr){
        int j=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
