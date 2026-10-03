package Bai3;

public class AdvanceMath extends MathUtils{
    @Override
    public int sum(int a, int b){
        return a + b + 10;
    }
    // Overloading
    public double sum(double a, double b){
        return a + b;
    }
}
