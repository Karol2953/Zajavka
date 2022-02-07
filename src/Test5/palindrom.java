package Test5;

public class palindrom {
    public static void main(String[] args) {

        isPalindrom();
        System.out.println(isPalindrom());

    }

    public static boolean isPalindrom() {

        String word = "Akta generała ma mała renegatka";
        word = word.toLowerCase();    // delete big letter;
        word = word.replaceAll(" ", "");  // delete spaces between words;


        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                System.out.println(word.charAt(i));
                return false;
            }

        }
        return true;
    }
}


