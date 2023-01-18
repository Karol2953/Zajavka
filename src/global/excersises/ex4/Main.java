package global.excersises.ex4;

/*Zdefiniuj metodę statyczną signsCreator(), która na podstawie przekazanych liczb (można
przekazać dowolną ilość) zwróci tablicę char[], ze znakami stojącymi pod podanymi w argumentach
miejscami w tablicy ASCII (http://www.asciitable.com/). Załóżmy, że do metody można przekazać
tylko wartości liczbowe z zakresu 32 - 127. Napisaną metodę, spróbuj podzielić na kroki i każdy krok
wyciągnąć do oddzielnej metody*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[] arr = signCreator(34,35,36,37,46,41,67);
        System.out.println(Arrays.toString(arr));
    }

    private static char[] signCreator(int... args) {
        char[] chars = new char[args.length - calculateNotHandledCases(args)];
        castToChar(chars,args);
        return chars;
    }

    private static void castToChar(char[] chars, int[] args) {
        int j = 0;
        for (int arg : args){
            if (arg >= 33 && arg <= 127){
                chars[j] = (char)arg;
            }
        }
    }

    private static int calculateNotHandledCases(int [] args) {
        int notHandledCases = 0;

        for (int arg :args) {
            if (arg < 33 || arg > 127){
                System.out.println("Case" + arg + "not handled");
                notHandledCases++;
            }

        }
        return notHandledCases;
    }

}



