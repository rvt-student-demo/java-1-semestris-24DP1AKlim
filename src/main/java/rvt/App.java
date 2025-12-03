package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.add(new Product("Keyboard", 54.99));
        shop.add(new FoodProduct("Banana", 2, "11.11.2025"));
        shop.add(new DiscountProduct("Book", 12.30, 50));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadiet produkta nosaukumu: ");
        String name = scanner.nextLine();

        System.out.print("Ievadiet produkta cenu: ");
        shop.add(new Product(name, scanner.nextDouble()));

        for (int i = 0; i < shop.size(); i++) {
            System.out.println(shop.get(i));
            System.out.println(shop.get(i).getFinalPrice());
        }
        System.out.println(shop.sumOfPrices());

        scanner.close();
    }
}

class Shop extends ArrayList<Product> {
    public double sumOfPrices() {
        double sum = 0;

        for (int i = 0; i < this.size(); i++) {
            sum += this.get(i).getFinalPrice();
        }
        return sum;
    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }

    public double getFinalPrice() {
        return price;
    }
}

class FoodProduct extends Product {
    String expiryDate;

    public FoodProduct(String name, double price, String expiryDate) {
        // super šajā piemerā ir Product (parent class)
        super(name, price);
        this.expiryDate = expiryDate;
    }

    // Override, lai modificētu oriģinalo toString() metodi
    @Override
    public String toString() {
        return super.toString() + ", Expiry date: " + expiryDate;
    }
}

class DiscountProduct extends Product {
    int discountPercent;

    public DiscountProduct(String name, double price, int discountPercent) {
        // super šajā piemerā ir Product (parent class)
        super(name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double getFinalPrice() {
        return price - (price * discountPercent / 100);
    }

    // Override, lai modificētu oriģinalo toString() metodi
    @Override
    public String toString() {
        return super.toString() + ", discount Percent: " + discountPercent;
    }
}
