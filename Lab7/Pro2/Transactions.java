import java.util.Date;

public class Transactions {
    Date currentDate = new Date();
    private double[] history = new double[6];
    private String[] Type = new String[6];
    private double[] balance = new double[6];
    private int i = 0;

    public void gettransiction(String Type, double Amount, double balance) {
        this.history[i] = Amount;
        this.Type[i] = Type;
        this.balance[i] = balance;
        i++;
        i %= 7;
    }

    public void printtransaction() {
        for(int i=0;i<6;i++)
        {
            System.out.println(currentDate + "\t " + Type[i] + "\t\t\t" + history[i] + "\t\t\t" + balance[i]);
        }
        
    }
}
