package Pro3;

import java.util.Scanner;

public class Lab8_Pro3 {
    public static void main(String[] args) {
        double width,height;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Width of first rectangle : ");
        width=keyboard.nextDouble();
        System.out.print("Input Height of first rectangle : ");
        height=keyboard.nextDouble();
        Rectangle Rec1 = new Rectangle(width,height);
        System.out.print("Input Width of first rectangle : ");
        width=keyboard.nextDouble();
        System.out.print("Input Height of first rectangle : ");
        height=keyboard.nextDouble();
        Rectangle Rec2 = new Rectangle(width,height);
        keyboard.close();
        System.out.println(Rec1.toString());
        System.out.println(Rec2.toString());
        System.out.print("\nEqual?"+Rec1.equals(Rec2));
        System.out.print("\nArea Rec1 compare to Rec2  "+Rec1.compareTo(Rec2));
    }
}
