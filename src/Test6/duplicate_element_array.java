package Test6;

public class duplicate_element_array {
    public static void main(String[] args) {
        int[] array = {1, 5,5,5,5, 6, 3, 3, 8, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);

                }
            }
        }
    }
}
