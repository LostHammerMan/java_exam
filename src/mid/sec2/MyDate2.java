package mid.sec2;

public class MyDate2 {
    private final int year;
    private final int month;
    private final int day;
    public MyDate2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate2 withYear(int newYear) {
        return new MyDate2(newYear, month, day);
    }
    public MyDate2 withMonth(int newMonth) {
        return new MyDate2(year, newMonth, day);
    }
    public MyDate2 withDay(int newDay) {
        return new MyDate2(year, month, newDay);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
