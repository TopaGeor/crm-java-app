package gr.codehub.commerce.service;

import gr.codehub.commerce.model.Product;

public interface ICart {

    void addProduct(Product product);
    void removeProduct(int productId);
    double calculateTotalPrice();


}
