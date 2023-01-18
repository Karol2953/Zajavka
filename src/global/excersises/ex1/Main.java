package global.excersises.ex1;

public class Main {

    public static void main(String[] args) {
    String string = Global.GLOBAL_VARIABLE;

    String string1 = Global.GLOBAL_VARIABLE; // that wouldnt possible if not "import static global.ex1.ex1.Global.GLOBAL_VARIABLE;"

        System.out.println(Global.GLOBAL_VARIABLE);
        System.out.println(Global.GLOBAL_VARIABLE);

    }
}
