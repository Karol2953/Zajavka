package com.company;

public class metod {
    public static void main(String[] args) {
        externalMethod(method1()+method2(method3() + method4()));

    }

    public static void externalMethod (int arg) {
        System.out.println("externalMethod");

    }

    public  static int method1() {
        System.out.println("method1");
        return 1;
    }

    public  static int method2(int i) {
        System.out.println("method2");
        return 2;

    }

    private static int method3() {
        System.out.println("method3");
        return 3;
    }

    private static int method4() {
        System.out.println("method4");
        return 4;
    }
}
