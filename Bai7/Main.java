package Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        int so_ngay = sc.nextInt();

        Room room;
        if(type.equals("V")){
            room = new VIP();
        }
        else{
            room = new Standard();
        }
        System.out.println(room.calculateTotal(so_ngay));
    }
}
