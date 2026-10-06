package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> list  = new ArrayList<>(); // mang động luu cac doi tuong

        for(int i=0; i<n; i++){
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            if(type.equals("D")){
                int overtime = sc.nextInt();
                list.add(new Developer(name, salary, overtime));
            }
            else if(type.equals("T")){
                int bugs = sc.nextInt();
                list.add(new Tester(name, salary, bugs));
            }
            else{
                list.add(new Employee(name, salary));
            }
        }

        for(int i=0; i<list.size(); i++){
            Employee e = list.get(i); // lay doi tuong thu i gan vao kieu bien employee. => upcasting
            System.out.println("----------------------------");
            System.out.println(e.getName() + " - bonus " + e.calculateBonus());

            if(e instanceof Developer){
                System.out.println("Tang khoa hoc AWS");
            }
            else if(e instanceof Tester){
                System.out.println("Tang tool test");
            }
        }
        sc.close();
    }
}
