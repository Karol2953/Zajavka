package abstractClass;

public abstract class Animal {

    protected String color;

    public Animal(String color) {
        this.color = color;
    }

    abstract String gimmeVoice();
}
