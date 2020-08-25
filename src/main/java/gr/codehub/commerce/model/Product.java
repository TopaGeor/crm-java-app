package gr.codehub.commerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Supplier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private double price;
    private int quantity;
    private Category category;
    private Supplier supplier;

}