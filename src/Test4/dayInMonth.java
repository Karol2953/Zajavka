package Test4;

public class dayInMonth {
    public static void main(String[] args) {

        int numberMonth = 2;
        switch (numberMonth) {
            case 1:     //January
            case 3:     //March
            case 5:     //May
            case 7:     //July
            case 8:     //August
            case 10:    //October
            case 12:    //December
                System.out.println("This month has 31 days");
                break;

            case 4:     //April
            case 6:     //June
            case 9:     //September
            case 11:    //November
                System.out.println("This month has 30 days");
                break;

            case 2:         //February
                System.out.println("This month has 28 days");
        }

    }
}
