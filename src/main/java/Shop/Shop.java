package Shop;

import Shop.Accessories.GuitarStrings;
import Shop.Instruments.Brass.Trumpet;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISellable> stockItems;
    private String category;
    public double till;

    public Shop(String name){
        this.name = name;
        this.stockItems = new ArrayList<>();
        this.till = 0.00;
    }

    public String getName() {
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public int getNoOfStockItems() {
        return this.stockItems.size();
    }

    public ArrayList getStockItems() {
        return this.stockItems;
    }

    public void addStockItem(StockItem item) {
        this.stockItems.add(item);
    }


    public void removeStockItem(StockItem item) {
        this.stockItems.remove(item);
    }

    public String sellItem(StockItem itemToBeSold) {

        if(itemExists(itemToBeSold)){
            setTill(itemToBeSold.getRetailPrice());
            removeStockItem(itemToBeSold);
            String retailPriceString = String.format("%.2f", itemToBeSold.getRetailPrice());
            return itemToBeSold.getDescription() + " sold at £" + retailPriceString;}
        else
            return itemToBeSold.getDescription() + " isn't in stock";
    }

    public void setTill(double amount) {
        this.till += amount;
    }

    public double getTotalPotentialProfit(){
        double totPotentialProfit = 0.00;

        for(ISellable item: this.stockItems){
            totPotentialProfit += item.getMarkupAmount();
        }

        return totPotentialProfit;
    }

    public boolean itemExists(StockItem stockItem) {
        for(ISellable item: this.stockItems){
            return item.equals(stockItem);
        }
        return false;
    }

//    public int getNoOfStockItemsByCategory(String category) {
//        int count = 0;
//
//        for(ISellable item: this.stockItems){
//            if(item.getIntrumentCategory().equals(category));
//                count +=1;}
//            return count;
//        }
//
//    }
}
