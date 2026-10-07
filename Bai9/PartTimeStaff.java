package Bai9;

public class PartTimeStaff extends Staff{
    private int workingHours;
    private double hourlyRate;

    public PartTimeStaff(String id, String name, int workingHours, double hourlyRate){
        super(id, name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double getPaymentAmount() {
        return workingHours * hourlyRate;
    }
    @Override
    public String toString(){
        return "Part_time_staff - " + this.getName() + " - payment : " + this.getPaymentAmount();
    }
}
