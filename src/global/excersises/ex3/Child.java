package global.excersises.ex3;

public class Child extends AParent {
    @Override
    String getName() {
        return "Get Name method from Child Class";
    }

    public static String getClassName(){
        return "This is Child Class";
    }
}
