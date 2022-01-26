package Test3;

public class task1 {
    public static void main(String[] args) {
        //1. Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.

        addition();
        substraction();
        multiplication();
        division();
    }

    static void addition() {
        double a = 10.12;
        double b = 23.21;
        double c = a + b;
        System.out.println(c);
    }

    static void substraction() {
        double a = 100;
        double b = 23.21;
        double c = a - b;
        System.out.println(c);
    }

    static void multiplication() {
        double a = 10.12;
        double b = 23.21;
        double c = a * b;
        System.out.println(c);
    }

    static void division() {
        double a = 10.12;
        double b = 23.21;
        double c = a / b;
        System.out.println(c);
    }
}


