package Bai6;

public class Product {
    private String id;
    private String name;
    private double price;

    public  Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName(){return name;}

    public double getPrice(){return price;}

    public String getType(){return "Product";}

    public String getId(){return id;}

    public double getFinalPrice(){
        return price;
    }
}
