package Getter_Setter;

public class Car {

    private String company;
    private String model;
    private int productionYear;

    private  int [] array;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }
}
