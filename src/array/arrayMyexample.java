package array;

import java.util.Arrays;

public class arrayMyexample {
    public static void main(String[] args) {
        int[][] exampleArray = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 44, 44}
        };

        int[][] matrix = createMatrix(4, 6);
        /*printArray2(matrix);*/

    }
    private static int [][] createMatrix(int rows, int columns) {

        int [][] matrix = new int[rows][columns];

        for(int row = 0; row < rows; row++){
            for (int column = 0; column < columns ; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }

    private static int generateRandomValue(){
        int min = 0;
        int max =10;
        return (int) (Math.random() * ((max - min) +1)) + min;
    }

    private static void printArray(int [][] toPrint){
        for (int i = 0; i < toPrint.length; i++) {
            for (int j = 0; j < toPrint[i].length; j++) {
                System.out.println("accesing" + "[" + i + "]" + "[" + j + "]" + " " + toPrint[i][j]);
            }
        }

    }



    }

 