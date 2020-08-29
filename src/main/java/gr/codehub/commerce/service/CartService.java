package gr.codehub.commerce.service;

import gr.codehub.commerce.model.Category;
import gr.codehub.commerce.model.Product;
import gr.codehub.commerce.model.Supplier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CartService implements ICartService {
    private ArrayList<Product> products;

    public CartService() {
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
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }

//        for (int i = 0; i <products.size(); i++){
//            totalPrice += products.get(i).getPrice();
//        }
        return totalPrice;
    }

    @Override
    public void persistData() throws FileNotFoundException {
        File file = new File("basket.txt");

        PrintWriter pw = new PrintWriter(file);
        for (Product product : products) {
            pw.println(product.getName() + ","+
                    product.getPrice() + ","+
                    product.getQuantity() + ","+
                    product.getCategory());

        }
        pw.close();
    }

    @Override
    public void load() throws FileNotFoundException {
        File file = new File("basket.txt");

        Scanner sc = new Scanner(file);
        products.clear();

        while(sc.hasNext())
        {

            String line = sc.nextLine();

            String words[] = line.split(",");

            String productName = words[0];
            double productPrice = Double.parseDouble(words[1]);
            int productQuantity = Integer.parseInt(words[2]);

            Supplier supplier = new Supplier();

            Product product =   new Product(productName, productPrice,
                    productQuantity,
                    Category.SNACKS,   supplier);
            products.add(product);

        }


    }

}

