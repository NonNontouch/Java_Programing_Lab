package Pro1;
import java.util.Scanner;
public class Lab5_Pro1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Account ID = new Account(1122, 20000.00, 4.5,"7/2/2022");
        System.out.print("How much you want to withdraw : ");
        ID.withdraw(keyboard.nextDouble());
        System.out.print("How much you want to deposit : ");
        ID.deposit(keyboard.nextDouble());
        System.out.print("Your balance is : " + ID.getBalance());
        System.out.print("\nYour monthly interest is : " + ID.getMonthlyInterestRate());
        System.out.print("\nYour account was created on "+ID.getDate());
    }
}