package Shop.Accessories;

import Shop.Instruments.InstrumentType;
import Shop.StockItem;

public class SheetMusic extends StockItem {

    private InstrumentType instrumentType;

    public SheetMusic(String description,double wholesalePrice, double retailPrice, InstrumentType instrumentType){
        super(description, wholesalePrice, retailPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
