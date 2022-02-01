package array;

import java.util.Arrays;

public class example1 {
    public static void main(String[] args) {
        example1 arrayExample = new example1();

        arrayExample.arraysExample();

    }
    private void arraysExample(){
        String[] array = new String[10];

        int i = 0;
        while (i<5){
            array[i] = "Hello new index" + i;
            i++;
        }

        String completeContent = "";
        for (int k = 0; k < 7; k++) {
            completeContent = completeContent + array[k] + ";";
            System.out.println("Print => " + array[k]);
        }
        System.out.println(completeContent);
    }
}
