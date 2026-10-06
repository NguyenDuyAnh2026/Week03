package Bai10;

public class Employee {
    private String name;
    private  double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String  getName(){return name;}

    public double calculateBonus(){
        return baseSalary * 10 / 100;
    }

}
