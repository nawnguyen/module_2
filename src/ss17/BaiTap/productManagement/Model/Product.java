package ss17.BaiTap.productManagement.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private final String id;
    private final String name;
    private final double price;
    private final String brand;

    public Product(String id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + price + " - " + brand;
    }
}

