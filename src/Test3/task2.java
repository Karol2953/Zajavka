package Test3;
/*2. Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=. Na początku masz zadeklarowaną
        zmienną int x = 0. Podczas pisania programu nie możesz zadeklarować żadnej innej zmiennej, tzn.
        przez cały czas pisania programu możesz operować tylko na tej jednej zmiennej.*/

public class task2 {
    public static void main(String[] args) {
        int x = 0;

        System.out.println(x == 0);
        System.out.println(x == 5);
        System.out.println(!(x == 10));
        System.out.println(x != 10);
        x -= 2;
        x *= 10;

        x = x++;
        System.out.println(x);



    }
}
