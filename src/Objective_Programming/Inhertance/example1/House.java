package Objective_Programming.Inhertance.example1;

public class House extends Building{

    public int numberOfRooms = 3;
    public String name;
    public boolean hasWindows = true;


    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", name='" + name + '\'' +
                ", hasWindows=" + hasWindows +
                ", adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
