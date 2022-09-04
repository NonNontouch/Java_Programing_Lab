import java.util.Scanner;

public class Lab2_Pro5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, a, row;
        System.out.print("Enter the number of line : ");
        n = keyboard.nextInt();
        keyboard.close();
        for (row = 0; row <= n; row++) {
            for (a = n - row; a >= 1; a--) {
                System.out.print("  ");
            }
            for (a = row; a >= 2; a--) {
                System.out.printf("%d ", a);
            }
            for (a = 1; a <= row; a++) {
                System.out.printf("%d ", a);
            }
            System.out.printf("\n");
        }
    }
}
