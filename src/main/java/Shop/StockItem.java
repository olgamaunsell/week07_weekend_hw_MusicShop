package Shop;

public abstract class StockItem implements ISellable{

    private String description;
    private double wholesalePrice;
    private double retailPrice;

    public StockItem(String description, double wholesalePrice, double retailPrice){
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getWholesalePrice() {
        return this.wholesalePrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }
}
