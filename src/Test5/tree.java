package Test5;

public class tree {
    public static void main(String[] args) {

        String star = "*";
        String space = " ";
        String star2;
        String space2;

        int x1 = 8;   //Ilość znaków w podstawie bedzie (2*x1)

        for (int i = 0; i <= x1; i++) {
            star2 = star.repeat(i);
            space2 = space.repeat(x1 - i);
            System.out.println(space2 + star2 + star2);
        }

    }
        /*for (int i = 10; i > 0 ; i--) {
            space2 = space.repeat(i);
            System.out.println(space2);
        }*/




      /*  int x = 3;

        for (int i = x; i > 0 ; i--) {
            System.out.print("x");*/


}


