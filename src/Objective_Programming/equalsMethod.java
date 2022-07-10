package Objective_Programming;

public class equalsMethod {
    public static void main(String[] args) {
        equalsMethod.equalsExample();
    }

    private static void equalsExample(){
        Car car1 =new Car("Mercedes", "A-Class", 2010);
        Car car2 =new Car("BMW", "x1", 2009);
        Car car3 =new Car("Volkswagen", "Passat", 2015);
        Car car4 =new Car("Audi", "A4", 2003);
        Car car5 =new Car("Audi", "A4", 2003);

       // System.out.println(car4 == car5); //false (different object in memory)
       // System.out.println(car4.equals(car5)); // equals = " == "

        Dog dog = new Dog("Ciapek");

        System.out.println(car4.equals(null));
        System.out.println(car4.equals(1));
        System.out.println(car4.equals("Hello"));
        System.out.println(car4.equals(car5));
        System.out.println(car4.equals(dog));
        System.out.println(car4.equals(car3));

    }
}
