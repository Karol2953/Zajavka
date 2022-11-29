package Project_1.person;

import Project_1.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);

    void consume(Food food);
}
