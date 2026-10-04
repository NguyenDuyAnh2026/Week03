package Bai6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public void printBill(){
        double total = 0;
        for(Product p : products){
            System.out.println(p.getId() +" - " +p.getName() + " - " + p.getType() + " - " +p.getFinalPrice()) ;
            total += p.getFinalPrice();
        }
        System.out.println("Total = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Order order = new Order();

        for(int i=0; i<n; i++){
            String type = sc.next();
            String name = sc.next();
            double price = sc.nextDouble();

            String id = "SP" + (i+1);

            if(type.equals("E")){
                double thue_bh = sc.nextDouble();
                order.addProduct(new Electronics(id, name, price, thue_bh));
            }
            else{
                String date = sc.next();
                LocalDate hsd = LocalDate.parse(date); // doi chu thanh ngay
                order.addProduct(new Food(id, name, price, hsd));
            }
        }
        order.printBill();
    }
}
