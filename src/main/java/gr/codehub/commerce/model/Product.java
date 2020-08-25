package gr.codehub.commerce.model;

public class Product {
    private String name;
    private double price;
    private int quantity;


    //constructor
public Product(){
    this.name="unnamed";
}

    //setter and getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
