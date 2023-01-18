package initBlocks;

public class A {

    static {
        System.out.println("staticField1ClassA");
        staticField1ClassA = "staticField1ClassA";
    }

    static String staticField1ClassA;
    static String staticField2ClassA = initStaticField2ClassA();
    private String nonStaticField1ClassA;
    private String nonStaticField2ClassA;

    private String nonStaticField3ClassA = initField3ClassA();




    {
        nonStaticField2ClassA = "nonStaticField2";
        staticField1ClassA = "staticFieldClassA";
    }

    public A(String nonStaticField1ClassA) {
        this.nonStaticField1ClassA = nonStaticField1ClassA;
    }

    private String initField3ClassA() {
        System.out.println("InitField3ClassA");
        return "InitField3ClassA";
    }

    private static String initStaticField2ClassA() {
        System.out.println("initStaticField2ClassA");
        return "initStaticField2ClassA";
    }
}
