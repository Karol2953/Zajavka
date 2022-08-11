package Objective_Programming.classProperties;

import java.util.Objects;

public class Car {

    private String company;

    private String model;

    private int ProductionYear;

    public Car(String company, String model, int ProductionYear) {
        this.company = company;
        this.model = model;
        this.ProductionYear = ProductionYear;
    }
    //equals principles
    //- x.equals(x) should be always true
    //- x.equals(y) == true -> y.equals(x) == true
    //- x.equals(y) == true i y.equals(z) == true -> x.equals(z) == true
    // - in case of null -> false

//    public boolean equals (Object obj){
//        if (obj == null){
//           return false;
//        }
//        if (obj instanceof Car){
//            Car otherCar = (Car) obj;
//            return company.equals(otherCar.company)
//                    && model.equals(otherCar.model)
//                    && ProductionYear == otherCar.ProductionYear;
//        } return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (!Objects.equals(company, car.company)) {
            return false;
        }
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
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
