package Debugging.example2;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildHouse(5.0, "Zajavkova 7/5 , Tarnowoo podgorne");

        System.out.println(house.getArea());
        System.out.println(house.getAddress());
    }
}
