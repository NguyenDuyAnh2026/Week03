package Bai6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends  Product{
    private LocalDate hsd;
    private static final LocalDate today = LocalDate.of(2027, 9, 8);

    public Food(String id, String name, double price, LocalDate hsd){
        super(id, name, price);
        this.hsd = hsd;
    }
    @Override
    public String getType(){return "Food";}

    @Override
    public double getFinalPrice(){
        long so_ngay_con_lai = ChronoUnit.DAYS.between(today, hsd);
        if(so_ngay_con_lai < 7){
            return this.getPrice() - this.getPrice()  * 0.2; // giam 20%
        }
        return this.getPrice();
    }
}
