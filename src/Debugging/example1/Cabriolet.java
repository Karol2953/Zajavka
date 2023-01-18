package Debugging.example1;

public class Cabriolet extends Car {

    private boolean roofOpened;

    public Cabriolet(final String company, final String model, final String color, final boolean roofOpened, final String... additionalEquipment) {
        super(company, model, color, additionalEquipment);
        this.roofOpened = roofOpened;
    }

    public void greeting() {
        System.out.println("Hello my own");
    }

    @Override
    public String openDoors() {
        return "Cabrio opening doors";
    }

    @Override
    public String openTrunk() {
        return "Cabrio opening Trunk";
    }

    @Override
    public String horn() {
        return "Cabrio making sound";
    }

    public void openRoof() {
        if (!roofOpened) {
            System.out.println("Cabrio opening the roof");
            this.roofOpened = true;
        }
    }

    public void closeRoof() {
        if (roofOpened) {
            System.out.println("Cabrio closing the roof");
            this.roofOpened = false;
        }
    }
}
