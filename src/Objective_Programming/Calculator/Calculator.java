package Objective_Programming.Calculator;

import java.util.Objects;

public class Calculator {
    public String name;

//    public Calculator(String name){
//        this.name = name;
//    }
//        public boolean equals(Object obj){
//        if (this ==obj) {
//            return true;
//        }
//        if (obj == null || !(obj instanceof Calculator)) {        // !different object than Calculator
//            return false;
//        }
//        Calculator calculator = (Calculator) obj;
//        return calculator.name.equals(this.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
