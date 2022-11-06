package array;

import java.util.Arrays;

import static java.util.Arrays.*;

public class testclass {

    public static void main(String[] args) {
        int[] numbers = new int[]{15, 7, 4, 2, 2, 5, 4, 5, 5, 1, 2,3,21,2,5,6,7,2,2,2,2,2,2};

        int counter = 0;
        int searchingNumber = 2;
        for (int i = 0; i < numbers.length; i++) {
            {
                if (numbers[i] == searchingNumber) {
                    counter++;
                }
            }
        }

        System.out.println("This is counter: " + counter);

        int[] searchingNumberArray = new int[counter];

        for (int i = 0; i < searchingNumberArray.length; i++) {
            searchingNumberArray[i] = searchingNumber;
        }

        /*fill(searchingNumberArray, searchingNumber);*/

        System.out.println(Arrays.toString(searchingNumberArray));


        for (int i = 0; i < searchingNumberArray.length; i++) {
            System.out.print(searchingNumberArray[i]);
        }
    }
}





//:)


