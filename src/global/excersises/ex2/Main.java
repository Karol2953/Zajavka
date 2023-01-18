package global.excersises.ex2;

/*
Stwórz klasę Static, która wydrukuje na ekranie kiedy po raz pierwszy zostanie użyta. Stwórz w niej
        pola wskazane poniżej. Stwórz 5 instancji klasy, za każdym razem drukując na ekranie counter i name.
        Pola w klasie:
        ◦ statyczne counter (zliczające ile instancji klasy stworzyliśmy),
        ◦ instancyjne name*/




public class Main {

    public static void main(String[] args) {
        Static s1 = new Static("Kolek");
        System.out.println("Name ," + s1.getName() + " ,counter" + s1.getCounter()); //Shouldnt be s1 should be Static.

        Static s2 = new Static("Matolek");
        System.out.println("Name ," + s2.getName() + " ,counter" + s2.getCounter());

        Static s3 = new Static("Alojzy");
        System.out.println("Name ," + s3.getName() + " ,counter" + s3.getCounter());

        Static s4 = new Static("Wierzcholek");
        System.out.println("Name ," + s4.getName() + " ,counter" + s4.getCounter());

        Static s5 = new Static("Pacholek");
        System.out.println("Name ," + s5.getName() + " ,counter" + s5.getCounter());
    }

}
