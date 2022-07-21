package Objective_Programming.Autoboxing;

public class Autoboxing {
    public static void main(String[] args) {
//        byte a = 3;
//        short b =10;
//        int c = 19;
//        long d = 12;
//        char e = 's';
//
//        Byte aC = a;
//        Short bC = b;
//        Integer cC= c;
//        Long dC = d;
//        Character eC = e;
//
//        int f = cC;
//
//        String a1 = "12";
//        int b2 = Integer.parseInt(a1);
//
//        System.out.println(b2);
        long sum = 0L; // compare time between "Long" and "long"
        for (long i = 0; i <Integer.MAX_VALUE ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }


}
