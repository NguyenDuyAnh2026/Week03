package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();   // xoa dau Enter con thua

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Loai (F/P): ");
            String type = sc.nextLine();

            System.out.print("Ten: ");
            String name = sc.nextLine();

            String id = "NV" + (i + 1);

            if (type.equals("F")) {
                System.out.print("Luong co ban: ");
                double base = sc.nextDouble();
                System.out.print("Thuong: ");
                double bonus = sc.nextDouble();
                System.out.print("Phat: ");
                double penalty = sc.nextDouble();
                sc.nextLine();   // xoa Enter con thua

                employees[i] = new FullTimeEmployee(id, name, "N/A", base, bonus, penalty);
            }
            else {
                System.out.print("So gio lam: ");
                double hours = sc.nextDouble();
                System.out.print("Luong theo gio: ");
                double rate = sc.nextDouble();
                sc.nextLine();   // xoa Enter con thua

                employees[i] = new PartTimeEmployee(id, name, "N/A", hours, rate);
            }
        }

        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getType() + " - " + e.calculateSalary());
        }
    }
}