package Objective_Programming.Calculator;

public class Calculator {
    public String name;

    public Calculator(String name){
        this.name = name;
    }

        public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Calculator)) {        // !different object than Calculator
            return false;
        }
        if (!(obj instanceof Calculator)){
           return false;
        }

        return false;
    }
}
