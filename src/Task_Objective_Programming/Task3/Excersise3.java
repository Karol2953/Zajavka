package Task_Objective_Programming.Task3;
/*Write class square* with 2 constructor one defoult side will 5 a second with free value , getter and setter re
member about encapsulation add method counting field of square overwrite method toString and write equals /
 */

public class Excersise3 extends Square {
    public static void main(String[] args) {
        excersise3();
    }

    private static void excersise3() {

        Square square1 = new Square();
        Square square2 = new Square(20);

        System.out.println(square1.CalculateField());
        System.out.println(square2.CalculateField());
    }
}
