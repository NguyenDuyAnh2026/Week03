package Bai5;

public abstract class Employee {
    private String name;
    private String id;
    private String dob;

    public Employee(String name, String id, String dob){
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }

    public abstract String  getType();
    public abstract double calculateSalary();
}
