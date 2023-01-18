package Enum.Excersise2;

import java.util.Arrays;

public enum Dance {

    HIPHOP(new String[]{"10:00", "12:00"}, new Day[]{Day.MONDAY, Day.FRIDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    JAZZ(new String[]{"1:00", "15:00"}, new Day[]{Day.SATURDAY, Day.WEDNESDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    SAMBA(new String[]{"2:00", "23:00"}, new Day[]{Day.FRIDAY, Day.THURSDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    CHACHA(new String[]{"9:00", "12.00"}, new Day[]{Day.THURSDAY, Day.MONDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    BALLET(new String[]{"24:00", "6:00"}, new Day[]{Day.SUNDAY, Day.SATURDAY}) {
        @Override
        public Dance getAlternative() {
            return JAZZ;
        }
    };

    private final String[] hours;
    private final Day[] days;

    Dance(String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public String getHours() {
        return Arrays.toString(hours);
    }

    public String getDays() {
        return Arrays.toString(days);
    }

    public abstract Dance getAlternative();
}
