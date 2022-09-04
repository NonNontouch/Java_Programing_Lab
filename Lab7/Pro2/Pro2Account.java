public class Pro2Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private String Date;

    public Pro2Account(int INPUTid, double INPUTbalance, double INPUTannualInterestRate, String INPUTdate) {
        id = INPUTid;
        balance = INPUTbalance;
        annualInterestRate = INPUTannualInterestRate;
        Date = INPUTdate;
    }

    public Pro2Account() {
        name = "George";
        id = 1122;
        balance = 1000;
        annualInterestRate = 1.65;
        Date = "1/1/1970";
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getannualinterestrate() {
        return annualInterestRate;
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
