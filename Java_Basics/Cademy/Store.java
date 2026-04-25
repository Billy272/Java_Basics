package Cademy;

public class Store {
    public String productType;
    public int inventoryCount;
    public double inventoryPrice;


    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void advertise() {
        System.out.println("Selling this " + productType + "!");
    }
}
