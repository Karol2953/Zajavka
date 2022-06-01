//Napisz program, który znajdzie w tablicy zduplikowane elementy i stworzy z nich tablicę. Kolejność
//nie ma znaczenia.

package Test6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicate_sum_array {
    public static void main(String[] args) {
         excersise4();
    }

    private static void excersise4() {
        int [] arr = {3 ,3 ,2,2, 1,5,2,1,5,6};
        System.out.println("Original" + Arrays.toString(arr));

        int [] duplicatesArr = new int [arr.length/2]; //number of elements in theory should be half length of original arr
        int duplicateIndex = 0;

        //

        for (final int element : arr) {
            if (elementDuplicatedIn(arr, element) && elementPresentIn(duplicatesArr,element,duplicateIndex) ) {
                duplicatesArr[duplicateIndex] = element;
                duplicateIndex++;
            }

        }

        int [] duplicatesArrResized = new int[duplicateIndex];
        assignArray(duplicatesArrResized, duplicatesArr);
        System.out.println("Duplicates: " + Arrays.toString(duplicatesArr));
        System.out.println("Duplicates resized: " + Arrays.toString(duplicatesArrResized));
    }
    private static boolean elementDuplicatedIn (final int [] arr, final int elementToCheck) {
        int counter = 0;

        for (int element: arr) {
            counter = element == elementToCheck ? counter + 1 : counter;
            if (counter >= 2) {
                return true;
            }
        } return false;
    }

    private static boolean elementPresentIn (final int [] duplicatesArr,
                                             final int elementToCheck,
                                             final int duplicateIndex)
    {

    }



}
