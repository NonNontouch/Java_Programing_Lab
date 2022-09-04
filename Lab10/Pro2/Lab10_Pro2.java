package Pro2;

import java.util.Scanner;

public class Lab10_Pro2 {

    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean filled;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is its color : ");
        color = keyboard.next();
        System.out.print("Is is filled? (true or false ONLY): ");
        filled = keyboard.nextBoolean();

        try {
            System.out.print("Input FIRST sides of Triangle : ");
            side1 = keyboard.nextDouble();
            System.out.print("Input SECOUND sides of Triangle : ");
            side2 = keyboard.nextDouble();
            System.out.print("Input THIRD sides of Triangle : ");
            side3 = keyboard.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3,color,filled);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
