package Task_Objective_Programming.Task2;

import java.util.function.Function;

public class Excersises  {
    public static void main(String[] args) {

        exercise2();
    }

    private static void exercise2() {

      FunctionClass half = new HalfCalculator();
      FunctionClass quarter = new QuarterCalculator();

       /* System.out.println(half.calculate(50));
        System.out.println(quarter.calculate(80));
        System.out.println(half.calculate(100));
        System.out.println(quarter.calculate(120));*/

        int start = 125467;

        Function[] functions = new Function[10];

        for (int i = 0; i < functions.length; i++) {
            if (i % 2 == 0) functions[i] = (Function) new HalfCalculator();
            else functions[i] = (Function) new QuarterCalculator();
            System.out.println(functions.toString());
        }

    }







}
