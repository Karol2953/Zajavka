package global.excersises.ex3;

/*3. Stwórz klasę abstrakcyjną AParent, która będzie miała metodę String getName() oraz statyczną
        metodę String getClassName(). Stwórz klasę Child, która będzie nadpisywała metodę String
        getName() oraz definiowała statyczną metodę String getClassName(). Użyj dziedziczenia. Stwórz 2
        instancje klasy Child przypisując je do referencji Parent oraz Child. Wywołaj obie metody na
        referencjach, ich wynik wydrukuj na ekranie. Zauważ różnicę i postaraj się znaleźć wyjaśnienie.*/

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        AParent aParent = new Child();


        System.out.println(child1.getName());
        System.out.println(aParent.getName());

        System.out.println(Child.getClassName());
        System.out.println(AParent.getClassName());

    }
}
