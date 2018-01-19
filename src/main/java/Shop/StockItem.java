package Shop;

public abstract class StockItem {

    private String description;
    private double wholesalePrice;
    private double retailsPrice;

    public StockItem(String description, double wholesalePrice, double retailPrice){
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailsPrice = retailPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getWholesalePrice() {
        return this.wholesalePrice;
    }
}
