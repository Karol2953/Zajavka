package Project_1.person;

import Project_1.product.Chocolate;
import Project_1.product.Food;
import Project_1.product.Sandwitch;
import Project_1.product.Soup;


public class Producer extends Person implements ProducingMan {


    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getExpectations() {
        return "no expectations";
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);

    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
      switch (productName){
          case "chocolate":
              return new Chocolate(productName,this, consumingMan);

          case "soup":
              return new Soup(productName,this ,consumingMan);

          default: return new Sandwitch(productName,this ,consumingMan);
      }
    }

}
