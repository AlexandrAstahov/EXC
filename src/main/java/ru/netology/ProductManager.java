package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductManager {
    private ProductRepository repo;


    public void add (Product product){
        repo.add(product);
    }

    public Product[] searchByName (String query){
        Product[] result = new Product[0];
        for (Product product : repo.FindAll()) {
            if(product.matches(product, query)){
                result[result.length - 1] = product;
            }

        }
        return result;
    }


}
