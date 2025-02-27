package dz13;

public class Product {
    protected int id;
    protected String name;
    protected int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isTooExpensive() {
        if(price > 1_000_000){
            return true;
        } else {
            return false;
        }
    }
}
