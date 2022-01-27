package Test3;

/*5. Napisz metodę, która jako argument przyjmuje liczbę i wydrukuje informację czy metoda jest
        podzielna przed 3, przez 7 oraz przez 3 i 7 jednocześnie.*/
public class task4 {
    public static void main(String[] args) {

        someMethod(35);
        someMethod(24);
        someMethod(32);
        someMethod(12);
        someMethod(21);
        someMethod(177);

    }
    public static void someMethod(int a) {
        if (a%7 == 0 && a%3==0) {
            System.out.println("liczba jest podzielna przez 3 i 7 jednoczesnie");
        }
        else if (a%3==0) {
            System.out.println(" liczba podzielna jest tylko przez 3");
        }

        else if (a%7==0) {
            System.out.println(" liczba podzielna jest tylko przez 7");
        }
    }
}
