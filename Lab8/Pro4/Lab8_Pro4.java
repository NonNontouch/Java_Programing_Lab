package Pro4;

import java.security.Key;
import java.util.Scanner;

public class Lab8_Pro4  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner keyboard = new Scanner(System.in);
        double side;
        System.out.print("Input side of octagon : ");
        side = keyboard.nextDouble();
        Octagon Oct1 = new Octagon(side);
        Octagon Oct2 = (Octagon)Oct1.clone();
        System.out.println(Oct1.toString());
        System.out.println(Oct2.toString());
        if(Oct1.compareTo(Oct2)==1)
        {
            System.out.println("Octagon is more than clone.");
        }
        else if(Oct1.compareTo(Oct2)==-1)
        {
            System.out.println("Octagon is less than clone.");
        }
        else 
        {
            System.out.println("Octagon is equal clone");
        }
    }
}
