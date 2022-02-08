package Test5;

public class tree {
    public static void main(String[] args) {

        String star = "*";
        String space = " ";
        String star2;
        String space2;
        String space3;

        int x1 = 20;   //Ilość znaków w podstawie bedzie (2*x1)

        for (int i = 0; i <= x1; i++) {
            star2 = star.repeat(i);
            space2 = space.repeat(x1 - i);
            space3 = space.repeat(x1 + i);
            System.out.println(space2 + star2 + space3 );
        }

    }



}


