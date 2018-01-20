package Shop.Accessories;

import Shop.Instruments.InstrumentType;
import Shop.StockItem;

public class SheetMusic extends StockItem {

    private InstrumentType instrumentType;

    public SheetMusic(String description,double wholesalePrice, InstrumentType instrumentType){
        super(description, wholesalePrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public double calculateMarkup(double markupIncrease){
        return getWholesalePrice() * markupIncrease;
    }

    public String sell(){
        String retailPriceString = String.format("%.2f", getRetailPrice());
        return getDescription() + " selling at £" + retailPriceString;
    }
}
