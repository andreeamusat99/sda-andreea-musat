package Homework.enums;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY, SUNDAY;

    private boolean isWeekDay(){
        return true;
    }
    public boolean isHoliday(){
        //return the opposite of isWeek
        return false;
    }
}
