
package Task_Objective_Programming.Task3;

/*
Write class square* with 2 constructor one defoult side will 5 a second with free value , getter and setter re
member about encapsulation add method counting field of square overwrite method toString and write equals /
 */
public class Square {

    private int sideOfSquare;

    public Square(){
       this.sideOfSquare = 5;
    }
    public Square(int sideOfSquare){
        this.sideOfSquare = sideOfSquare;
    }

    public int CalculateField (){
        return sideOfSquare*sideOfSquare;
     }

}
