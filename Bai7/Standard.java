package Bai7;

public class Standard extends Room {
    public Standard(){
        super(500000);
    }
    @Override
    public long calculateTotal(int so_ngay){
        long total = this.getPrice() * so_ngay;
        if(so_ngay > 3) {
            total = total * 95 / 100;
        }
        return total;
    }

}
