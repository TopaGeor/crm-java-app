package gr.codehub.commerce;

import gr.codehub.commerce.model.Category;
import gr.codehub.commerce.model.Product;

import gr.codehub.commerce.model.Supplier;
import gr.codehub.commerce.service.Cart;
import gr.codehub.commerce.service.Ui;

public class Main {
    public static void main(String[] args) {
       Ui ui = new Ui();
       ui.manageCart();

    }
}
