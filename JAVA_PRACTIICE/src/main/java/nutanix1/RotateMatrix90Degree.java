package nutanix1;

import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(matrix);
        printRotatedMatrix(matrix);
    }

    public static void rotateMatrix(int[][] matrix){
        int n = matrix.length;

        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0;i<n; i++){
            reverseMatrix(matrix[i]);
        }
    }


    public static void reverseMatrix(int[] matrix){
        int start = 0, end = matrix.length-1;
        while(start < end){
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
    }

    public static void printRotatedMatrix(int[][] matrix){
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
