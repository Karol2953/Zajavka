package array;

public class example2 {
    public static void main(String[] args) {

        example2 arrayExample = new example2();
        arrayExample.arraysExample2();
    }

    private void arraysExample2() {
        double[] array = new double[]{1.0, 2.5, 3.0, 3.5, 4.5, 2.00000, 21.2122, 31.21213};

        double total = 0;
        for (double element : array) {
            total += element;
            System.out.println(total);

            System.out.println("Total: " + total);

            double maximum = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maximum) {
                    maximum = array[i];
                }
            }
            System.out.println("Maximum: " + maximum);
        }
    }
}
