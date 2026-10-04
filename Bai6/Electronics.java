package Bai6;

public class Electronics extends Product{
    private double thue_bh;
    public Electronics(String id, String name, double price,
                       double thue_bh){
        super(id, name, price);
        this.thue_bh = thue_bh;
    }
    @Override
    public String getType(){
        return "Electronics";
    }
    @Override
    public double getFinalPrice(){
        double vat = this.getPrice() * 0.1;
        return this.getPrice() + vat + thue_bh;
    }
}
