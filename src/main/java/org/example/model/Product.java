package model;

public class Product implements ComponentItem {

    private final Double price;

    public Product(Double price) {
        this.price = price;
    }

    @Override
    public Double calcPrice() {
        return price;
    }
}
