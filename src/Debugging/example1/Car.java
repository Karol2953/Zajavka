package Debugging.example1;

public abstract class Car implements Hornable {

    private String company;
    private String model;
    private String color;
    private String[] additionalEquipment;

    public Car(String company, String model, String color, String... additionalEquipment) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.additionalEquipment = additionalEquipment;
        example();
    }

    private void example() {
        System.out.println("Method call example");
    }


    public abstract String openDoors();

    public abstract String openTrunk();

    protected String sayHello(String company, String model, String color) {
        return String.format("Hello my name is %s %s. I'm %s", company, model, color);
    }

    public int countAdditionalEquipElements() {
        return additionalEquipment.length;
    }

    public String getAdditionalEquipment() {
        StringBuilder sb = new StringBuilder("Equipment: ");
        for (String s : additionalEquipment) {
            sb.append(s).append(",");
        }
        return sb.toString();
    }

    public void greetings() {
        System.out.println(sayHello(company, model, color));
        System.out.println(horn());
        System.out.println(openDoors());
        System.out.println(openTrunk());
    }
}
