package Test6;

public class StringReverse {
    public static void main(String[] args) {
        String SomeWord = "Dupa";
        System.out.println(SomeWord);
        for (int i = SomeWord.length() -1; i >= 0 ; i--) {
            System.out.print(SomeWord.charAt(i));
        }
        System.out.println();

        }
    }
