
/*
        1. Napisz program, który dla podanego Stringa przypisze wartość jego długości do zmiennej, następnie
        wyświetli jego długość na ekranie.
        2. Napisz program, który sklei ze sobą 5 dowolnych Stringów na 2 pokazane różne sposoby i wydrukuje
        rezultat na ekranie.
        3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę
        zmiennoprzecinkową.
        4. Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo "Java".
        5. Napisz program, który porówna 2 stringi w taki sposób żeby wynik "Java".equals("jaVa") zwrócił
        true.
        6. Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków, wytnie string od
        indeksu 3 o długości 5 znaków. Czyli np. dla stringa "SomeStringLongerThan10Signs" otrzymamy
        "eStri".


*/

public class Test2 {
    public static void main(String[] args) {

        //1. Napisz program, który dla podanego Stringa przypisze wartość jego długości do zmiennej, następnie
        //        wyświetli jego długość na ekranie.

        String lengthOfString = "Karol has a cat";
        System.out.println(lengthOfString.length());
//-----------------------------------------------------------------------------------------------------


     //   2. Napisz program, który sklei ze sobą 5 dowolnych Stringów na 2 pokazane różne sposoby i wydrukuje
        //rezultat na ekranie.
//--------------------------------------------------------------------------------------------------------
        String first = "Ala";
        String second = "has";
        String third = "a cat ";
        String fourth = "and ";
        String fifth = "it brown";

        String sum = first + second + third + fourth + fifth;
        System.out.println(sum);

        System.out.println(first.concat(second).concat(third).concat(fourth).concat(fifth));

 //       3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę
//        zmiennoprzecinkową.


        String a = "a";
        String a2 = "ą";
        String e = "e";
        String e2 = "ę";
        String i= "i";
        String o = "o";
        String o2 = "ó";
        String u = "u";
        String y = "y";

        String bigA = "A";
        String bigA2= "Ą";
        String bigE= "E";
        String bigE2 = "Ę";
        String bigI = "I";
        String bigO = "O";
        String BigO2 = "Ó";
        String BigU = "U";
        String BigY = "Y";

        double toReplace = 69.69;

        String sentence = "Król kręcił kółka ósmekowo na wesoło";

        String replacement = " " + toReplace + " ";

        String replacement3= " " + toReplace;

        String replaced = sentence.replaceAll(a, replacement3);

//-------------------------------------------------------------------------------------------------------

        //4. Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo "Java".

        String check1 = "Java jest super";
        boolean a1 = check1.contains("Java");
        System.out.println(a1);


        //5. Napisz program, który porówna 2 stringi w taki sposób żeby wynik "Java".equals("jaVa") zwrócił
        //true.

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        String x2 = "Java";
        String x3 = "java";
        System.out.println(x2.equals(x3));


        //6. Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków, wytnie string od
       //indeksu 3 o długości 5 znaków. Czyli np. dla stringa "SomeStringLongerThan10Signs" otrzymamy
        //"eStri".

        String toCut = "SomeStringLongerThan10Signs";
        System.out.println(toCut.substring(2,8));

        String string123 = "String";
        string123.length();


       String a23 = "JavaCoding! ";
       a23.trim();
       a23.substring(2,3);
       a23=a23+2;
       a23=a23 + "world";
        System.out.println(a23);
        System.out.println(a23.length());

    }
}
