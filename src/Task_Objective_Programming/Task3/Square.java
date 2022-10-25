package Task_Objective_Programming.Task3;

/*
Write class square* with 2 constructor one defoult side will 5 a second with free value , getter and setter re
member about encapsulation add method counting field of square overwrite method toString and write equals /
 */
public class Square {

    private int sideOfSquare;

    public Square() {
        this.sideOfSquare = 5;
    }

    public Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public int CalculateField() {
        return sideOfSquare * sideOfSquare;
    }

    public int CalculatePerimeter() {
        return sideOfSquare * 4;
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return sideOfSquare == square.sideOfSquare;
    }

    @Override
    public int hashCode() {
        return sideOfSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideOfSquare=" + sideOfSquare +
                '}';
    }
}