package Enum.Excersise1;

public class Excersise1 {

    Day monday = Day.MONDAY;

    public static void main(String[] args) {

        for (Day day: Day.values()) {
            System.out.println(day + "(" + day.getShortValue() + ")" +
                    "Is it working day?: " + day.isWorkingDay() + " | " +
                    "Is it weekend days:? " + day.isWeekend());
        }
    }
}
