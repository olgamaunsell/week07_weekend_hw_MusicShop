package Shop;

public interface ISellable {

    String sell();

    double calculateMarkup(double increase);

    double getMarkupAmount();

//    String getIntrumentCategory();

}
