package Objective_Programming;

public class TrickyOverloading {
    public static void main(String[] args) {

        TrickyOverloading trickyOverloading = new TrickyOverloading();

        byte b = 12;
        short s = 1049;
        int i = 1023452;
        long l = 12323121l;
        float f = 123.4f;
        double d = 12.2;

        trickyOverloading.overloadedMethod(b);
        trickyOverloading.overloadedMethod(s);
        trickyOverloading.overloadedMethod(i);
        trickyOverloading.overloadedMethod(l);
        trickyOverloading.overloadedMethod(f);
        trickyOverloading.overloadedMethod(d);
    }

    private void overloadedMethod(byte arg1) {System.out.println("byte arg1: " + arg1);}
    private void overloadedMethod(short arg1) {System.out.println("short arg1: " + arg1);}
    private void overloadedMethod(int arg1) {System.out.println("int arg1: " + arg1);}
    private void overloadedMethod(long arg1) {System.out.println("long arg1: " + arg1);}
    private void overloadedMethod(float arg1) {System.out.println("double arg1: " + arg1);}
    private void overloadedMethod(double arg1) {System.out.println("float arg1: " + arg1);}
}
