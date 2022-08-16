package Objective_Programming.ReferenceVsObject;

public class ReferenceVsObject {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla("12", "KingKong");
        Monkey gorilla2 = gorilla;

        Gorilla gorilla3 = (Gorilla) gorilla2;

        System.out.println(gorilla == gorilla3);

    }
}
