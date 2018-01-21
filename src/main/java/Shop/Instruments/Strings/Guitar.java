package Shop.Instruments.Strings;

import Shop.Instruments.Instrument;

public class Guitar extends Instrument {

    String guitarType;
    int noOfStrings;

    public Guitar(String description, double wholesalePrice, String category, String colour, String material, String guitarType, int noOfStrings){
        super(description, wholesalePrice, category, colour, material);
        this.guitarType = guitarType;
        this.noOfStrings = noOfStrings;
    }


    public String getGuitarType() {
        return this.guitarType;
    }

    public int noOfStrings() {
        return this.noOfStrings;
    }

    public String play(){
        return "Guitar strumming";
    }

    public String sell(){
        String retailPriceString = String.format("%.2f", getRetailPrice());
        return getDescription() + " selling at £" + retailPriceString;
    }
}
