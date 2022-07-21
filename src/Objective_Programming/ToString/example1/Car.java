package Objective_Programming.ToString;

public class Car {
    private String company;
    private String model;
    private int ProductionYear;


    public Car (String company, String model, int ProductionYear) {
        this.company = company;
        this.model = model;
        this.ProductionYear = ProductionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", ProductionYear=" + ProductionYear +
                '}';
    }
}
