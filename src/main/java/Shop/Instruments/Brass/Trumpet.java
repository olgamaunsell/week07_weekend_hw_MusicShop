package Shop.Instruments.Brass;

import Shop.Instruments.Instrument;

public class Trumpet extends Instrument {

    int valves;

    public Trumpet(String description, double wholesalePrice, double retailPrice, String category, String colour, String material, int valves){
        super(description, wholesalePrice, retailPrice, category, colour, material);
        this.valves = valves;
    }


    public int getValves() {
        return this.valves;
    }
}
