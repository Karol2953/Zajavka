package final_;

public  class Dog extends Puppy {
   protected final String name;

    public Dog( final String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

