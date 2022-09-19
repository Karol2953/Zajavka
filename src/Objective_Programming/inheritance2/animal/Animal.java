package Objective_Programming.inheritance2.animal;

public class Animal {

    protected String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }

    protected Animal create(){
        Animal animal = new Animal("black");
        animal.color = "weird color";
        return animal;
    }

    String sound (){ return "Animal Soudn";}
    public String gimmeColor(){return this.color;}
}
