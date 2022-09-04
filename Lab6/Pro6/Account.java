package Pro6;

import java.util.Scanner;

public class Account {
    private int id;
    private int balance=100;
    public Account(int id)
    {
        this.id=id;
    }
    public int checkbalance()
    {
        return balance;
    }
    public void withdraw()
    {
        Scanner keyboard = new Scanner(System.in);
        int howmuch;
        System.out.print("Enter an amount to withdraw : ");
        howmuch=keyboard.nextInt();
        balance-=howmuch;
    }
    public void deposit()
    {
        int howmuch;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an amount to deposit : ");
        howmuch=keyboard.nextInt();
        balance+=howmuch;

    }
}
