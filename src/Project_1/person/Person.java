package Project_1.person;

import Project_1.product.Food;

public abstract class Person implements ConsumingMan {

    private  final String name;
    private  final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
