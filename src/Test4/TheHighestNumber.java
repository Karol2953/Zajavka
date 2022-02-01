package Test4;
/*2. Napisz program, który określi która z 3 podanych liczb jest największa.*/
public class TheHighestNumber {
    public static void main(String[] args) {
        int a = 110;
        int b = 2;
        int c = 35;
        int max = 0;

        if (a > b && a > c) {
            max = a;
        }

        if (b > c && b > a) {
            max = b;
        }
        if (c > a && c > b){
            max = c;
        }
        System.out.println("The highest number is " + max);



        /*
        if (a > b) {
            if (a > c) {
                max = a;
                System.out.println(max);
            }
        }

        if (b > a) {
            if (b > c) {
                max = b;
                System.out.println(max);
            }
        }
        if (c > a) {
            if (c > b){
                max = c;
                System.out.println(max);

            }
        }*/


    }


}
