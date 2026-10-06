package Bai10;

public class Tester extends Employee{
    private int bugsFound;

    public Tester(String name, double baseSalary, int bugsFound){
        super(name, baseSalary);
        this.bugsFound = bugsFound;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + bugsFound * 50000;
    }
}
