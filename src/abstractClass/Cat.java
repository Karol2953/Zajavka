package abstractClass;

public class Cat extends Animal {

    private String name;

    public Cat (String name, String color) {
        super(color);
        this.color = color;
    }

    @Override
    String gimmeVoice(){
         {return "Cat meow";}
    }
}

