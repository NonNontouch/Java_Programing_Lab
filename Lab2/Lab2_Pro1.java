import java.util.Scanner;

public class Lab2_Pro1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int today, day_elapsed, futureday;
        String todaystring = "", futuresString = "";

        System.out.print("Enter today's day : ");
        today = keyboard.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        day_elapsed = keyboard.nextInt();
        keyboard.close();
        futureday = (today + day_elapsed) % 7;
        switch (today) {
            case 0:
                todaystring = "Sunday";
                break;
            case 1:
                todaystring = "Monday";
                break;
            case 2:
                todaystring = "Tuesday";
                break;
            case 3:
                todaystring = "Wendesday";
                break;
            case 4:
                todaystring = "Thursday";
                break;
            case 5:
                todaystring = "Friday";
                break;
            case 6:
                todaystring = "Saturday";
                break;
        }
        switch (futureday) {
            case 0:
                futuresString = "Sunday";
                break;
            case 1:
                futuresString = "Monday";
                break;
            case 2:
                futuresString = "Tuesday";
                break;
            case 3:
                futuresString = "Wendesday";
                break;
            case 4:
                futuresString = "Thursday";
                break;
            case 5:
                futuresString = "Friday";
                break;
            case 6:
                futuresString = "Saturday";
                break;
        }
        System.out.printf("Today is %s and the future day is %s", todaystring, futuresString);
    }
}
