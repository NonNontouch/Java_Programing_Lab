import java.util.GregorianCalendar;
import java.util.Scanner;

public class SavingsAccount extends Account {
    private int overdraftlimit = 5000;
    private int withdraw=0;

    public SavingsAccount() {
        SetAccount(2);
        GregorianCalendar gcal = new GregorianCalendar();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("SavingAccount");
        System.out.println("Balance is " + getBalance());
        do
        {
            System.out.print("Withdraw : ");
            withdraw = keyboard.nextInt();
        }while(getBalance()-withdraw<0);
        withdraw(withdraw);
        System.out.println("Balance is " + getBalance());
        System.out.println("This account was created at " + gcal.getTime());

    }

}
