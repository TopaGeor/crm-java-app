package gr.codehub.commerce.service;

import gr.codehub.commerce.model.Product;
import gr.codehub.commerce.service.ICart;

import java.util.ArrayList;

public class Cart implements ICart {
    private ArrayList<Product> products;

    public Cart(){
        products = new ArrayList<>();
    }


    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(int productId) {
        products.remove(productId);
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(Product product: products)
            totalPrice += product.getPrice();
        return totalPrice;
    }
}
