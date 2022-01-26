package Test3;

/*. Napisz program, w którym zaczynając od zmiennej byte x = 0, będzie można otrzymać int, long,
        float oraz double stosując promocję numeryczną.*/

public class task3 {
    public static void main(String[] args) {
        byte x = 0;
        int a = x + 2;
        long l = x + 2l;
        float f = x + 4.2333f;
        double d = x + 6.9;

        System.out.println(x + " " + a  +" " + l  +" " + f  +" " + d );


    }
}
