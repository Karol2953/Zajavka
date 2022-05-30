package array;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 6, 1, 2, 3, 5, 6, 7};

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length + i) ; j++) {
                if (array[j-1] > array[j]) {
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
                    System.out.println(Arrays.toString(array));

                }

            }
            
        }
    }



}

