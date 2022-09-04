import java.util.GregorianCalendar;

public class Lab4_Pro2 {
    public static void main(String[] args) {
        System.out.println("Current year,month,date and day of week");
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Year is "+gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+gcal.get(GregorianCalendar.DAY_OF_WEEK)+"\n----------");
        System.out.println("After specified the elapsed time of one day after current day");
        gcal.setTimeInMillis(gcal.getTimeInMillis()+86400000);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is "+gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+gcal.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+gcal.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+gcal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(gcal.getTime());
    }
}
