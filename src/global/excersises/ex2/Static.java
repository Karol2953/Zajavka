package global.excersises.ex2;

public class Static {

    static {
        System.out.println("Creating Static Class");
    }

    private final String name;
   private static int counter;

    public Static (String name){
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}
