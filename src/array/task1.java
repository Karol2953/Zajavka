package array;

public class task1 {
    public static void main(String[] args) {

        task1 max_number = new task1();

        max_number.max_number();
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
}
