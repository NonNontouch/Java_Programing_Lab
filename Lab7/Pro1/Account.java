import java.util.GregorianCalendar;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String Date;

    public Account(int INPUTid, double INPUTbalance, double INPUTannualInterestRate, String INPUTdate) {
        id = INPUTid;
        balance = INPUTbalance;
        annualInterestRate = INPUTannualInterestRate;
        Date = INPUTdate;
    }

    public Account() {
        this(0,0.0,0.0,"1/1/1970");
    }
    public void  SetAccount(int accounttype)
    {
        if(accounttype==2)
        {
            
            id=0;
            balance=5000.0;
            annualInterestRate=1.5;
            Date="21/2/2022";
        }
        else if(accounttype==1)
        {
            id=0;
            balance=5000.0;
            annualInterestRate=1.5;
            Date="21/2/2022";
        }
    }
    public double getMonthlyInterestRate() {
        double MonthlyInterestRate = balance * ((annualInterestRate / 100) / 12);
        return MonthlyInterestRate;
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDate() {
        return this.Date;
    }
}
