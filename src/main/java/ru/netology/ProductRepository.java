package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ProductRepository {
    private Product[] products = new Product[0];


    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }


    public Product[] findAll() {
        return products;
    }


    public void DeleteById(int id) {
        if (searchById(id) == null) {
            throw new NotFoundException("Элемент с id: " + id + " не найден");
        }
        Product[] tmp = new Product[products.length - 1];
        int index = 0;

        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

    public Product[] searchById(int id) {
        Product[] result = new Product[0];
        for (Product product : findAll()) {
            if (product.getId() == id) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
                return result;
            }
        }
        return null;
    }

}
