package OOP.stock;

import java.text.DecimalFormat;

public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public String getChangePercent() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        if (previousClosingPrice < currentPrice) {
            return "increase "
                    + String.valueOf(df.format((currentPrice - previousClosingPrice) * 100 / previousClosingPrice))
                    + "%";
        }else return "decrease "
                + String.valueOf(df.format((previousClosingPrice - currentPrice) * 100 / previousClosingPrice))
                + "%";
    }
}
