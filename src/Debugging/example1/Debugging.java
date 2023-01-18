package Debugging.example1;

public class Debugging {

    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet("BMW", "SERIES 8", "DEPP RED", true, "fire extinguisher", "massage");
        Cabriolet cabriolet2 = new Cabriolet("Mercedes", "GLA", "DEPP BLUE", false);
        cabriolet.greetings();
        cabriolet.closeRoof();
        System.out.println(cabriolet.countAdditionalEquipElements());
        System.out.println(cabriolet.getAdditionalEquipment());
    }
}
