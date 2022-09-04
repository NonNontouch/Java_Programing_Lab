import java.util.Scanner;

public class Pro2_64011160 {
    public static void main(String[] args) {
        Float A, B, C, D, E, F, X, Y;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.println("Input first linear equation (aX + bY = c) ");
            System.out.print("a : ");
            A = keyboard.nextFloat();
            System.out.print("b : ");
            B = keyboard.nextFloat();
            System.out.print("c : ");
            C = keyboard.nextFloat();
            System.out.println("Input secound linear equation (dX + eY = f) ");
            System.out.print("d : ");
            D = keyboard.nextFloat();
            System.out.print("e : ");
            E = keyboard.nextFloat();
            System.out.print("f : ");
            F = keyboard.nextFloat();
        } finally {
            keyboard.close();
        }
        X = ((E * C) - (B * F)) / ((A * E) - (B * D));
        Y = ((A * F) - (C * D)) / ((A * E) - (B * D));
        System.out.printf("Answer is X : %.2f Y : %.2f", X, Y);

    }
}
