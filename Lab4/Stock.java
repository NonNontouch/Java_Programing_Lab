public class Stock{
    private String Symbol = "ORCL";
    private String Name = " Oracle Coperation";
    private double previousClosingPrice;
    private double currentPrice;
    public String getSymbol()
    {
        return Symbol;
    }
    public String getName()
    {
        return Name;
    }
    public double getChangePercent(double previous, double current) {
        previousClosingPrice=previous;
        currentPrice=current;
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
}
