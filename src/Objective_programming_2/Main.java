package Objective_programming_2;

import Objective_programming_2.animal.Cat;
import Objective_programming_2.animal2.Animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();

        Animal catnimal = new Cat();

        animal.eat();
        cat.eat();
        catnimal.eat();

    }
}
