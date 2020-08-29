package gr.codehub.commerce.service;

import gr.codehub.commerce.model.Product;

import java.io.FileNotFoundException;

public interface ICartService {

    void addProduct(Product product);
    void removeProduct(int productId);
    double calculateTotalPrice();
    void persistData() throws FileNotFoundException;
    void load() throws FileNotFoundException;


}
