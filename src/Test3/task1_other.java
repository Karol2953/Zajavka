package Test3;
//1. Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.
public class task1_other {
    public static void main(String[] args) {
        Calculate(2.3,3.5);
        Calculate(2,15);
        Calculate(15,3);
        Calculate(12,12);
    }

    private static void Calculate( double a, double b)
    {
        System.out.println("Suma liczb wynosi: " + (a + b));
        System.out.println("Różnica liczb wynosi: " + (a - b));
        System.out.println("Iloczyn liczb wynosi: " + (a * b));
        System.out.println("Dzielenie liczb wynosi: " + (double)(a / b));
        System.out.println();

    }

}
