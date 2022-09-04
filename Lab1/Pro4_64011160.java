import java.util.Scanner;

public class Pro4_64011160 {
    public static void main(String[] args) {
        double weight,hight,BMI;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.print("Enter weight in pounds : ");
            weight = keyboard.nextDouble();
            System.out.print("Enter hight in inches : ");
            hight=keyboard.nextDouble();

        } finally {
            keyboard.close();
        }
        BMI=(weight*703)/Math.pow(hight, 2);
        System.out.printf("Your BMI is %.2f",BMI);
    }
}
