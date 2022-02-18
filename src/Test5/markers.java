package Test5;

//. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy) i rysuje nimi
//w podanej kolejności kolorów 100 kresek. Wypisz wszystkie kolory w kolejności odpowiadające
//rysowanym kreskom i zobacz jaki kolor będzie ostatni.

public class markers {
    public static void main(String[] args) {

        String [] markers = {"red", "green", "blue", "black", "yellow", "brown"};


        int numberOfLine = 10;

        double x = numberOfLine % markers.length;
        System.out.println(x);

        int x1 = numberOfLine / markers.length;
        System.out.println(x1);



        for (int i = 0; i < x1; i++) {
            System.out.println("--------");
            for (int j = 0; j < markers.length; j++) {
                System.out.println(markers[j]);

            }
            System.out.println("------------------end----------------");
        }
        if (x == 1) System.out.println("red");
        if (x == 2) System.out.println("green");
        if (x == 3) System.out.println("blue");
        if (x == 4) System.out.println("black");
        if (x == 5) System.out.println("yellow");
        if (x == 6) System.out.println("brown");

    }
}
