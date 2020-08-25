package gr.codehub.commerce.service;

import gr.codehub.commerce.model.Category;
import gr.codehub.commerce.model.Product;
import gr.codehub.commerce.model.Supplier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ui {

    public void manageCart(){
        ICart cart = new Cart();

//        do {
//            Product product = getProduct();
//            cart.addProduct(product);
//         } while (wantContinue());
        try {
            cart.load();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("TotalPrice "+cart.calculateTotalPrice());

        try {
            cart.persistData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




    private Product getProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give product name: ");
        String productName = scanner.nextLine();
        System.out.println("Give product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Give product quantity: ");
        int productQuantity = Integer.parseInt(scanner.nextLine());

        Supplier supplier = new Supplier();

        Product product =   new Product(productName, productPrice, productQuantity,
                Category.SNACKS,   supplier);
        return product;

    }


    private boolean wantContinue(){
        System.out.println("Do you want to continue ( y=yes) ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("y"))
                return true;
        else
            return false;

    }



}
