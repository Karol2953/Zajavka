package Objective_programming_2.inheritanc.animal.animal;


public class Cat extends Animal {

    @Override
    public Cat getAnimal() {
        return new Cat();
    }

    @Override
    public String toString() {
        return "Cat{}";
    }

}




