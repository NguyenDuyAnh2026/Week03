package Bai8;

public class DroneRobot extends Robot implements  Flyable, GPS{
    public DroneRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(this.getModelName() + " performing main task");
    }
    @Override
    public void fly() {
        System.out.println(getModelName() + " flying");
    }
    @Override
    public void getCoordinates(){
        System.out.println(this.getModelName() + " getting coordinates");
    }
}
