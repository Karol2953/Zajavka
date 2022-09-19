package passByReference_passByValue;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mruczek");
        System.out.println(cat.getName());
        method(cat);           //change value of Cat
        System.out.println(cat.getName());

    }
    static void method  (Cat anyCat) {
        anyCat.setName("Tuptuś");
    }
}
