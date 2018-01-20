package Shop.Accessories;

import Shop.StockItem;

public class DrumSticks extends StockItem {

    private String tip;

    public DrumSticks(String description,double wholesalePrice, String tip){
        super(description, wholesalePrice);
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }

    public double calculateMarkup(double markupIncrease){
        return getWholesalePrice() * markupIncrease;
    }
}
