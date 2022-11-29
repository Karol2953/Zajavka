package Project_1;

import Project_1.person.Consumer;
import Project_1.person.ConsumingMan;
import Project_1.person.Producer;
import Project_1.person.ProducingMan;
import Project_1.product.Food;

public class FoodFactory {
    public static void main(String[] args) {

        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }

    private void run() {
        ProducingMan [] producingPeople = new ProducingMan[]{
          new Producer("Alicja", "Zupowa"),
          new Producer("Krzysztof", "Ciastkarski")
        };

        ConsumingMan [] consumingPeople = new ConsumingMan[]{
                new Consumer("Rafał", "Pożeracz",  "chicken"),
                new Consumer("Angelika", "Zajadacz", "chocolate")
        };

        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }
        Food foods[] = new Food[counter];
        int index = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                Food food = producingPerson.produce(consumingPerson.getExpectations(), consumingPerson);
                foods[index] = food;
                index++;
            }
        }

        System.out.println("Printing food");

        for (Food food : foods) {
            System.out.println(food);
        }

    }
}
