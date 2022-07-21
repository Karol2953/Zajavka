package Objective_Programming.ToString.example2;

public class Building {

    public String adress = "St. Paul II";

    public int number = 12;
    public Flat flat = new Flat();

    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\'' +
                ", number=" + number +
                ", flat=" + flat +
                '}';
    }
}
