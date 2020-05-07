package ru.job4j.encapsulation;

public class Shop {

    public static Product[] delete(Product[] products, int index) {
        if (products.length - 1 < index) {
            return products;
        }
        for (int i = index; i < products.length; i++) {
            if (products.length - 1 >= i + 1) {
                products[i] = products[i + 1];
            }
        }
        products[products.length - 1] = null;
        return products;
    }


    public static Product[] show(Product[] products) {
        System.out.println();
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 8);
        products[4] = new Product("Tea", 15);

        show(products);
        delete(products, 10);
        show(products);
        delete(products, 4);
        show(products);
        delete(products, 0);
        show(products);
    }
}