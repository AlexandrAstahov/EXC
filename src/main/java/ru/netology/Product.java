package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public boolean matches (Product product, String query){
        return product.getName().contains(query);
    }
}
