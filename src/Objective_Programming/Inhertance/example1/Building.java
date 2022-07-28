package Objective_Programming.Inhertance.example1;

public class Building {

    public String adress = "St. Paul II";

    public int number = 14;

    public void print(){
        System.out.println("Im building");
    }


    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
