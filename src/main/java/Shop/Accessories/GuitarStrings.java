package Shop.Accessories;

import Shop.StockItem;

public class GuitarStrings extends StockItem {

    private double stringGauge;

    public GuitarStrings(String description,double wholesalePrice, double stringGauge){
        super(description, wholesalePrice);
        this.stringGauge = stringGauge;

    }

    public double getStringGauge() {
        return this.stringGauge;
    }

    public double calculateMarkup(double markupIncrease){
        return getWholesalePrice() * markupIncrease;
    }

    public String sell() {
        String retailPriceString = String.format("%.2f", getRetailPrice());
        return getDescription() + " selling at £" + retailPriceString;
    }
}
