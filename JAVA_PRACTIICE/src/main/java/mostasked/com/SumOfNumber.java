package mostasked.com;

public class SumOfNumber {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        int sum =0;
        for (int num: number){
            sum += num;
        }
        System.out.println(sum);

        //using deffent approach

        sum = number.length*(number.length+1)/2;
        System.out.println(sum);
    }
}
