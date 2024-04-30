package mid.sec2;

public class Main {
    public static void main(String[] args) {

        ImmutableMyDate myDate1 = new ImmutableMyDate(2024, 1,1);
        ImmutableMyDate myDate2 = myDate1;
        MyDate2 myDate21 = new MyDate2(2024, 1,1);
        MyDate2 myDate22 = myDate21;


        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);

        System.out.println("2025 -> date1");
        myDate1 = myDate1.setYear(2025);
        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);

    }
}
