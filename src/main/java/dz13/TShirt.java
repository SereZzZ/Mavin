package dz13;

public class TShirt extends Product {
    private String color;

    public TShirt(int id, String name, int price, String color) {
        super(id, name, price);
        this.color = color;
    }

    @Override
    public void use() {
        System.out.println("Носим футболку: " + name);
    }
}
