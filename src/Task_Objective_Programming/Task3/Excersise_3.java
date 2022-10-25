package Task_Objective_Programming.Task3;

import java.util.Arrays;

public class Excersise_3 {
    public static void main(String[] args) {
        excersise3();

    }

    private static void excersise3() {

        Square squares[] = new Square[]{
                new Square(),
                new Square(2),
                new Square(3),
                new Square(2),
                new Square(4),
                new Square(3),
                new Square(),
                new Square(6)
        };
        System.out.println(Arrays.toString(squares));
        Square[] deduplicate = deduplicateAndSort(squares);
        System.out.println(Arrays.toString(deduplicate));

    }

    private static Square[] deduplicateAndSort(Square[] arr) {

        sort(arr);
        int sizeOfNonDuplicates = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                sizeOfNonDuplicates++;
            }
        }
        int lenght = arr.length;

        Square[] temp = new Square[sizeOfNonDuplicates];
        int j = 0;

        for (int i = 0; i < lenght - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                temp[j++] = arr[i];
            }
        }
        temp[j] = arr[lenght - 1];
        return temp;


    }

    private static void sort(final Square[] arr) {
        Square temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].CalculateField() > arr[j].CalculateField()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


