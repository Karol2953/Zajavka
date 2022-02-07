package array;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

       /* task1 max_number = new task1();
        task1 min_number = new task1();*/
        //task1 sort = new task1();
        // task1 average = new task1();
        task1 median = new task1();

        /*max_number.max_number();
        min_number.min_number();*/
        //sort.sort();
        //average.average();
        median.median();
        //

    }

    private void median() {

        int[] numbers6 = new int[]{3,2,5,1,6,5,12,41,52,31,67,52};
        System.out.println("Array before sorting: ");
        for (int i = 0; i < numbers6.length; i++) {
            System.out.print(numbers6[i] + " ");
        }
        for (int i = 0; i < numbers6.length; i++) {
            for (int j = i + 1; j < numbers6.length; j++) {
                int tmp = 0;
                if (numbers6[i] > numbers6[j]) {
                    tmp = numbers6[i];
                    numbers6[i] = numbers6[j];
                    numbers6[j] = tmp;
                }
            }
        }
        System.out.println("");
        System.out.println("Array after sort: ");
        for (int i = 0; i < numbers6.length; i++) {
            System.out.print(numbers6[i] + " ");
        }
        if (numbers6.length % 2 == 0){
            System.out.println("");
            int mid_number = numbers6.length / 2;
            double x1 = ((double)numbers6[mid_number] + (double)numbers6[mid_number+1])/2;
            System.out.println("Mediana is: " + x1);
        }
        else {
             int median = numbers6.length / 2 ;
            System.out.println();
            System.out.println("Mediana is: " + numbers6[median]);
        }




        /*System.out.println("");
        System.out.println("String after sort");
        String numbers_sort = Arrays.toString(numbers6);
        System.out.println(numbers_sort);*/
    }


    private void max_number() {

        int max = 0;
        int[] numbers = new int[]{1, 6, 2, 7, 4, 9, 21, 13};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println(numbers[i]);
        }
        System.out.println("Maksymalna liczba w tablicy to: " + max);

    }

    private void min_number() {

        int min = 0;
        int[] numbers = new int[]{-1, 66, 26, 7, -4, 9, 21, -13};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            System.out.println(numbers[i]);
        }
        System.out.println("Najmniejsza liczba w tablicy to: " + min);

    }

    private void sort() {
        int[] numbers = new int[]{5, 7, 4, 2, 2, 1, 4, 5, 6, 1, 2};
        System.out.println("Array before sorting array[i]");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int tmp = 0;
                if (numbers[i] > numbers[j]) {
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

    private void average() {
        int[] numbers = new int[]{5, 7, 4, 2, 2, 1, 4, 5, 6, 1, 2, 43};
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("");
        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = ((double) sum / numbers.length);
        System.out.println("Sum numbers of array is: " + sum);
        System.out.println("Average numbers of array is: " + average);

    }
}

