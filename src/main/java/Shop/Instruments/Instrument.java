package Shop.Instruments;

public abstract class Instrument {

    private String category;
    private String colour;
    private String material;
//    private String brand;


    public Instrument(String category, String colour, String material){
        this.category = category;
        this.colour = colour;
        this.material = material;
    }

    public String getCategory() {
        return this.category;
    }
}
