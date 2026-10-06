package Bai10;

public class Developer extends  Employee{
    private int overtimeHours;
    public Developer(String name, double baseSalary, int overtimeHours){
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculateBonus(){
        return super.calculateBonus() + overtimeHours * 200000;
    }
}
