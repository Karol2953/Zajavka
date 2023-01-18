package initBlocks;

public class B extends A {
    static String staticField1ClassB;
    static String staticField2ClassB = initStaticField2ClassB();

    static {
        System.out.println("StaticFieldClassB1");
        staticField1ClassB = "staticFieldClassB";
    }

    static {
        System.out.println("StaticFieldClassB3");
        staticField1ClassB = "staticFieldClassB";
    }

    static {
        System.out.println("StaticFieldClassB2");
        staticField1ClassB = "staticFieldClassB";
    }

    private final String nonStaticField1ClassB;
    private final String nonStaticField2ClassB;
    private final String nonStaticField3ClassB = initField3ClassB();

    {
        System.out.println("nonStaticField2ClassB");
        nonStaticField2ClassB = "nonStaticField2ClassB ";
    }

    public B(String nonStaticField1ClassA, String nonStaticField1ClassB) {
        super(nonStaticField1ClassA);
        System.out.println("Constructor B");
        this.nonStaticField1ClassB = nonStaticField1ClassB;
    }

    private static String initStaticField2ClassB() {
        System.out.println("initField2ClassB");
        return "initStaticField2ClassB";
    }

    private String initField3ClassB() {
        System.out.println("InitField3ClassB");
        return "InitField3ClassB";
    }
}
