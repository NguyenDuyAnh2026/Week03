package Bai7;

public class Room {
    private long price;
    public Room(long price){
        this.price = price;
    }

    public long getPrice(){
        return price;
    }

    public long calculateTotal(int so_ngay){
        return price * so_ngay;
    }
}
