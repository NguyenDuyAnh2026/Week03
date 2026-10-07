package Bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IPayable[] payable_list = new IPayable[n];

        for(int i=0; i<n; i++){
            String type = sc.next();
            if(type.equals("S")){
                String id = sc.next();
                String name = sc.next();
                int hour = sc.nextInt();
                double rate = sc.nextDouble();
                payable_list[i]  = new PartTimeStaff(id, name , hour, rate);
            }
            else{ // : "I"
                String itemName = sc.next();
                int quantity = sc.nextInt();
                double  price = sc.nextDouble();
                payable_list[i] = new Invoice(itemName, quantity, price);
            }
        }
        double total  = 0;
        for(IPayable p : payable_list){
            System.out.println(p); // goi toString da ghi de
            total += p.getPaymentAmount(); // da hinh qua interface
        }
        System.out.println("Total payoemt = " + total);
        sc.close();;
    }
}
