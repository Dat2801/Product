package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private String producer;
    private double price;

    public Product(String productID, String productName, String producer, double price) {
        this.productID = productID;
        this.productName = productName;
        this.producer = producer;
        this.price = price;
    }
    public Product(){}

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
