package Task_Objective_Programming.Task3;
/*Write class square* with 2 constructor one defoult side will 5 a second with free value , getter and setter re
member about encapsulation add method counting field of square overwrite method toString and write equals /
 */

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Excersise3 extends Square {
    public static void main(String[] args) {
        excersise3();
    }

    private static void excersise3() {
        Square arraySquare [] = new Square[]{
        new Square(),
        new Square(15),
        new Square(14),
        new Square(1),
        new Square(1),
        new Square(69),
        new Square(),
        new Square(17),
        new Square(55),
        new Square(15)
         };

        sort(arraySquare);
    }
    private static void sort(final Square [] arr){
        Square temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].getSideOfSquare() > arr[j].getSideOfSquare()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
