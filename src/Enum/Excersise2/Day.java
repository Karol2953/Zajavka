package Enum.Excersise2;

import Enum.Excersise1.Weekend;
import Enum.Excersise1.WorkingDay;

public enum Day implements Weekend, WorkingDay {
    MONDAY("MON", true),
    TUESDAY("TUE", true),
    WEDNESDAY("WED", true),
    THURSDAY("THU", true),
    FRIDAY("FRI", true),
    SATURDAY("SAT", false),
    SUNDAY("SUN", false);
    private final String shortValue;
    private final boolean workingDay;

    Day(String shortValue, boolean workingDay) {
        this.shortValue = shortValue;
        this.workingDay = workingDay;
    }

    public String getShortValue() {
        return shortValue;
    }


    @Override
    public boolean isWorkingDay() {
        return workingDay;
    }

    @Override
    public boolean isWeekend() {
        return !workingDay;
    }


}
