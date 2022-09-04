package Pro1;

import java.util.Scanner;

public class Lab6_Pro1 {
    public static void main(String[] args) {
        String name;
        double weight, heightfeet, heightinch;
        Scanner keyboard = new Scanner(System.in);
        BMI user = new BMI();
        System.out.print("Input your name : ");
        name = keyboard.next();
        System.out.print("Input your weight in pound : ");
        weight = keyboard.nextDouble();
        System.out.print("Input you height in feet : ");
        heightfeet = keyboard.nextDouble();
        System.out.print("Input your remaining height in inch : ");
        heightinch = keyboard.nextDouble();
        keyboard.close();
        user.gethightfeet(heightfeet);
        user.getheightinch(heightinch);
        user.getweight(weight);
        System.out.print(user.getBMI());
    }
}
