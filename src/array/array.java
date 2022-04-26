package array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int[][] dim2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        /*przekatna(dim2);*/
        przekatna2(dim2);
    }


    public static void przekatna(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i != j) {
                    continue;
                } else {
                    System.out.println(array[i][j]);
                    sum += array[i][j];
                }
            }

        }
        System.out.println("Suma wynosi: " + sum);

    }

    public static void przekatna2(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array[i].length - 1  -i) {
                    sum += array[i][j];
                }

            }

        }
        System.out.println(sum);

    }


}