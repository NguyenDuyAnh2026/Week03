package Bai8;

public class FishRobot extends Robot implements  Swimmable{
    public FishRobot(int id, String modelName){
        super(id, modelName);
    }
    @Override
    public void performMainTask(){
        System.out.println(this.getModelName() + " performing main task");
    }
    @Override
    public void swim(){
        System.out.println(this.getModelName() + " Swimming");
    }
}
