package Shop.Instruments.Strings;

import Shop.Instruments.Instrument;

public class Violin extends Instrument {
    String violinSize;

    public Violin(String description, double wholesalePrice, String category, String colour, String material, String violinSize){
        super(description, wholesalePrice, category, colour, material);
        this.violinSize = violinSize;

    }


    public String getViolinSize() {
        return this.violinSize;
    }


    public String play(){
        return "Guitar strumming";
    }

    public String sell(){
        String retailPriceString = String.format("%.2f", getRetailPrice());
        return getDescription() + " selling at £" + retailPriceString;
    }
}
