package gr.codehub.commerce;

import gr.codehub.commerce.model.Category;
import gr.codehub.commerce.model.Product;

import gr.codehub.commerce.model.Supplier;
import gr.codehub.commerce.service.Cart;

public class Main {
    public static void main(String[] args) {
       Cart cart = new Cart();
        Product c = new Product("patata", 1.30,2,
                Category.SNACKS,
                new Supplier());
    }
}
