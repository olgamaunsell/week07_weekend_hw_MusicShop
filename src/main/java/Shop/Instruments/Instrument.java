package Shop.Instruments;

import Shop.ISellable;
import Shop.StockItem;

public abstract class Instrument extends StockItem implements IPlayable {

    private InstrumentCategory category;
    private String colour;
    private String material;
//    private String brand;


    public Instrument(String description, double wholesalePrice, InstrumentCategory category, String colour, String material){
        super(description, wholesalePrice);
        this.category = category;
        this.colour = colour;
        this.material = material;
    }


    public InstrumentCategory getCategory() {
        return this.category;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }



}
