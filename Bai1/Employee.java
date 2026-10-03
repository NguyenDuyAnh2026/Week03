package Bai1;

public class Employee extends Person {
    private double salary;
    public Employee(){
        super("unknown"); // truyen ten mac dinh cho Person
        System.out.println("2.Employee is created");
    }
}
