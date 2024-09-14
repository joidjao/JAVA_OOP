package org.example.javaencapsulation;

public class Encapsulation1 {

    // Fields (Encapsulation)
    private String productName;
    private String productDescription;
    private String manufacturer;

    // Constructor
    public Encapsulation1(String productName, String productDescription, String manufacturer) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.manufacturer = manufacturer;
    }

    // Getters (Encapsulation)
    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // Setters (if needed)
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
