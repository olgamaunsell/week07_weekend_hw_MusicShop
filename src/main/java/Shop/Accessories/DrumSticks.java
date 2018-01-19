package Shop.Accessories;

import Shop.StockItem;

public class DrumSticks extends StockItem {

    private String tip;

    public DrumSticks(String description,double wholesalePrice, double retailPrice, String tip){
        super(description, wholesalePrice, retailPrice);
        this.tip = tip;
    }

    public String getTip() {
        return this.tip;
    }
}
