package array;

import java.util.Arrays;

public class arrayMyexample2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 2},
                {1, 4, 5},
                {9, 3, 7}
        };
        /*printSum(matrix);*/
        highestNumberInRow(matrix);


    }

    private static void highestNumberInRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int highestNumber = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix [i][j] > highestNumber){
                    highestNumber = matrix[i][j];

                }


            }
            System.out.println("Highest number is: " + highestNumber);



        }

    }


    private static void printSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("Sum firs row is: " + sum);
        }

    }


    private static void breakExample(int[][] example) {
        for (int i = 0; i < example.length; i++) {
            for (int j = 0; j < example[i].length; j++) {
                if (i > 1) {
                    break;
                }
                System.out.println("accesing" + "[" + i + "]" + "[" + j + "]" + " " + example[i][j]);
            }
        }


    }

    private static void printArray2(int[][] toPrint) {
        for (int[] internArray : toPrint) {
            System.out.println(Arrays.toString(internArray));

        }
    }

}

 