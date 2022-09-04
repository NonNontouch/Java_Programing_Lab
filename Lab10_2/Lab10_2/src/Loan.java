import java.util.Date;

public class Loan {
    private double AnnualIntersetRate;
    private int numberofYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);

    }

    public Loan(double AnnualIntersetRate, int numberofYears, double loanAmount) {
        this.AnnualIntersetRate = AnnualIntersetRate;
        this.numberofYears = numberofYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return AnnualIntersetRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.AnnualIntersetRate = annualInterestRate;
    }

    public int getNumberofYear() {
        return numberofYears;
    }

    public void setNumberofYear(int numberofYears) {
        this.numberofYears = numberofYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = AnnualIntersetRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberofYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberofYears * 12;
        return totalPayment;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
