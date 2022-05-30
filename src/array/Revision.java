package array;

import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 8};
        bubbleSort(array);
        /*Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        */
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j-1] ;
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println(Arrays.toString(array));
                }

            }
        }


    }
}


