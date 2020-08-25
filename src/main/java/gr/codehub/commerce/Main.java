package gr.codehub.commerce;

import gr.codehub.commerce.model.Product;

public class Main {
    public static void main(String[] args) {
        Product dairyProduct = new Product();
        Product x = dairyProduct;
        x.setName("chicklets");
        System.out.println(dairyProduct.getName());
        
    }
}
