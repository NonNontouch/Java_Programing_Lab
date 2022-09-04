package Pro1;
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
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        Date = "1/1/1970";
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
