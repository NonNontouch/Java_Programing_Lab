import java.util.Scanner;
public class Lab4_Pro1 {
    public static void main(String[] args) {
        double previous,current,changepercent;
        Stock Stock = new Stock();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Symbol : "+Stock.getSymbol());      
        System.out.println("Name : "+Stock.getName());
        System.out.print("Pervious Closing Price : ");
        previous=keyboard.nextDouble();
        System.out.print("Current Price : ");
        current=keyboard.nextDouble();
        keyboard.close();
        changepercent=Stock.getChangePercent(previous, current);
        System.out.print("Price Change : "+changepercent+"%");
    }
}
