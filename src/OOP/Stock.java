package OOP;

public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;
    public Stock(){
    }
    public Stock(String symbol,String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public float getChangePercent(){
        return (float)(currentPrice/previousClosingPrice);
    }
}
