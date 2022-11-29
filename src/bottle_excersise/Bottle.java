package bottle_excersise;

public class Bottle {

    private double Capasity;



    public static void main(String[] args) {

        Bottle[] bottles = new Bottle[3];

        bottles[0] = new Bottle(12.5);
        bottles[1] = new Bottle(22.0);
        bottles[2] = new Bottle(35.0);


       bottles[0].transfer(14.0,bottles[2]);



        for (int i = 0; i < bottles.length; i++) {
            System.out.println(bottles[i].getCapasity());
        }
    }

     private double getCapasity() {
        return Capasity;
    }

    public Bottle(double howManyLiters) {
        this.Capasity = howManyLiters;
    }

    private void addFluid (double quantity) {
        this.Capasity += quantity;
    }
    private void reduceFluid (double quantity) {
        if (Capasity > quantity){
            this.Capasity -= quantity;
        } else {
            System.out.println("The number is to big");
        }
    }
    private void transfer (double quantity, Bottle anotherbottle){
        if (Capasity > quantity){
            this.reduceFluid(quantity);
            anotherbottle.addFluid(quantity);
        }
        else System.out.println("The number is too big");
    }



}
