package Shop.Accessories;

import Shop.StockItem;

public class GuitarStrings extends StockItem {

    private double stringGauge;

    public GuitarStrings(String description,double wholesalePrice, double retailPrice, double stringGauge){
        super(description, wholesalePrice, retailPrice);
        this.stringGauge = stringGauge;

    }

    public double getStringGauge() {
        return this.stringGauge;
    }
}
