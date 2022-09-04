import java.util.Scanner;

import javax.swing.text.JTextComponent.KeyBinding;

public class Lab2_Pro3 {
    public static void main(String[] args) {
        int day_of_week, day_of_month, month, century, year_of_century,year;
        String todaystring = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input day of month : ");
        day_of_month = keyboard.nextInt();
        System.out.print("Input month : ");
        month = keyboard.nextInt();
        System.out.print("Input Year : ");
        year = keyboard.nextInt();
        keyboard.close();
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        century=year/100;
        year_of_century=year%100;
        day_of_week = (day_of_month + ((26 * (month + 1)) / 10) + (year_of_century / 4) + (century / 4) + (5 * century))
                % 7;

        switch (day_of_week) {
            case 0:
                todaystring = "Saturday";
                break;
            case 1:
                todaystring = "Sunday";
                break;
            case 2:
                todaystring = "Monday";
                break;
            case 3:
                todaystring = "Tuesday";
                break;
            case 4:
                todaystring = "Wendesday";
                break;
            case 5:
                todaystring = "Thursday";
                break;
            case 6:
                todaystring = "Friday";
                break;

        }
        System.out.printf("It's %s", todaystring);

    }
}
