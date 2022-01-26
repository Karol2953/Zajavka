public class ExampleClassoperatorsjava {
    public static void main (String[] args) {
        int a = 10;
        someMethod(a++);
        someMethod(a);

        int e = 7;
        e %= 2;
        System.out.println(e);
    }

    private static void someMethod(int someValue) {

        System.out.println("someValue " + someValue);
    }


}
