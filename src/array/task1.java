package array;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

       /* task1 max_number = new task1();
        task1 min_number = new task1();*/
        task1 sort = new task1();

        /*max_number.max_number();
        min_number.min_number();*/
        sort.sort();
        // TODO: 01.02.2022  min number, mediana, średnia, sortowanie

    }

    private void max_number () {

        int max = 0;
        int [] numbers = new int[] {1,6,2,7,4,9,21,13};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println(numbers[i]);
        }
        System.out.println("Maksymalna liczba w tablicy to: " + max);

    }

    private void min_number () {

        int min = 0;
        int [] numbers = new int[] {-1,66,26,7,-4,9,21,-13};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            System.out.println(numbers[i]);
        }
        System.out.println("Najmniejsza liczba w tablicy to: " + min);

    }
    private void sort() {
        int [] numbers = new int[] {5,7,4,2,2,1,4,5,6,1,2};
        System.out.println("Array before sorting array[i]");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++){
            for (int j =i +1; j < numbers.length; j++) {
                int tmp =0;
                if (numbers[i] < numbers[j]){
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }

        }
        System.out.println("");
        System.out.println("String after sort");
        String numbers_sort = Arrays.toString(numbers);
        System.out.println(numbers_sort);
    }
}
