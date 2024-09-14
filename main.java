package org.example.javaconstructor;

public class Main {

    public static void main(String[] args) {
        // Creating instances using constructors
        Practice1 practice1 = new Practice1("Jovy Idjao");
        Practice1 addition = new Practice1(3, 7);

        // Using Encapsulation1 class
        Encapsulation1 data1 = new Encapsulation1("Laptop", "High-end gaming laptop", "TechCorp");

        // Output the encapsulated data
        System.out.println("Product Name: " + data1.getProductName());
        System.out.println("Product Description: " + data1.getProductDescription());
        System.out.println("Manufacturer: " + data1.getManufacturer());
    }
}
