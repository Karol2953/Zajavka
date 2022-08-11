package Objective_programming_2.inheritance.animal.animal;


public class Animal {

   protected String name;
   private boolean hasLegs = true;

   public Animal(){

   }
   public Animal (String name){

   }

   @Override
   public String toString() {
      return "Animal{" +
              "name='" + name + '\'' +
              ", hasLegs=" + hasLegs +
              '}';
   }
}
