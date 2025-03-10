package arrays;

public class FindTheMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int n = 7;
        System.out.println(getMissingNumber(arr, n));
    }
    public static int getMissingNumber(int[] arr, int n){
        int expectedSum = n * (n+1)/2;
        int actualSum = 0;
        for(int num: arr){
            actualSum +=num;
        }
        return expectedSum - actualSum;
    }
}
