package array;

import java.util.Arrays;

public class arrayMyexample {
    public static void main(String[] args) {
        int [][] exampleArray = {
                {11,  12,  13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 44, 44}
        };
        for (int i = 0; i < exampleArray.length; i++) {
            for (int j = 0; j < exampleArray[i].length; j++) {
                System.out.println("accesing" + "[" + i+ "]"+ "[" + j+ "]" + " " + exampleArray[i][j]);
            }

        }
    }
}
 