package ru.netology;


public class ProductRepository {
    Product[] products = new Product[0];

    public void add (Product product) {
        Product [] tmp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
        }


    public Product[] FindAll() {
        return products;
    }

//    public Product[] DeleteById(int id) {
//        Product[] result = new Product[0];
//
//        for (Product product : products) {
//            if (products.matches(query)){
//
//            }
//
//        }
    }
