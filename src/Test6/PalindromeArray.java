//Napisz program, który sprawdzi, czy podany ciąg znaków jest palindromem. Tym razem wykorzystaj
//tablice.

package Test6;

public class PalindromeArray {
    public static void main(String[] args) {
        String result = "";
        String [] words = {"oko" , "kajak" , "oko"};
        for (int i = 0; i < words.length ; i++) {
            result += words[i];
        }
        System.out.print(result);

        System.out.println();

        String result_2 ="";
        for (int i = words.length -1 ; i >= 0 ; i--) {
            result_2 += words[i];
        }
        System.out.println(result_2);

        if (result.equals(result_2)) {
            System.out.println("That is palindrome");
        }
        else System.out.println("Nie jest");
    }
}
