import java.util.Scanner;
import java.util.Date;

public class CheckingAccout extends Account {
    private int overdraftlimit = 5000;

    public CheckingAccout() {
        SetAccount(1);
        Date currentDate = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Checking account");
        System.out.println("Balance is " + getBalance());
        System.out.print("Withdraw : ");
        withdraw(input.nextInt());
        System.out.println("Balance is " + getBalance());
        System.out.println("This account was created at " + currentDate);
    }
}
