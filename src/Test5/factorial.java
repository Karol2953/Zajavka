package Test5;

//program liczący silnie

public class factorial {
    public static void main(String[] args) {
        int n = 13;
        int silnia =1;
        for (int i = 1; i <= n; i++) {

           silnia *= i;
            
        }
        System.out.println(silnia);
    }
}
