import java.util.Scanner;

public class Lab7_Pro1 {
    public static void main(String[] args) {
        short accounttype;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Account, 1 for Checking Account ,2 for SavingsAccount : ");
        accounttype = keyboard.nextShort();
        if (accounttype == 1) {
            CheckingAccout account = new CheckingAccout();
        } else if (accounttype == 2) {
            SavingsAccount account = new SavingsAccount();

        }
        keyboard.close();
    }

}
