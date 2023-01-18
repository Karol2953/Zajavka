package Debugging.example2;

public class House {

    private double area;

    private String address;
    public House(double area, String address){
        constructArea(area);
        assignAdress(address);
    }

    private void assignAdress(String address) {
        this.address = address;
    }

    private void constructArea(double area) {
        System.out.println("Constructing area");
        biuldWalls(8);
        if (area > 0 && area < 10){
            this.area = area * 3;
        }
        else {
            this.area = area ;
        }
        System.out.println("Area constructed");
    }

    private void biuldWalls(int bricksAmount) {
        for (int i = 0; i < bricksAmount; i++) {
            System.out.println("Building brick no " + (i + 1));

        }
        System.out.println("Walls built");

    }

    public double getArea() {
        return area;
    }

    public String getAddress() {

        return address;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
