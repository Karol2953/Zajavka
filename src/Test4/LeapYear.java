package Test4;
/*1. Napisz program sprawdzający, czy podany rok jest przestępny i na ekranie wydrukuj TAK lub NIE.*/
public class LeapYear {
    public static void main(String[] args) {

        int year = 1900;
        if ( year % 4 == 0 && year % 100 != 0  ||  year % 400 == 0   ) {
            System.out.println("This year is leap year");
        }
        else
        {
            System.out.println("This year isn't leap year");
        }
    }

}
