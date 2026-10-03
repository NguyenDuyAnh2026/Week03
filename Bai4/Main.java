package Bai4;

public class Main {
    public static void main(String[] args) {
//        // b1 : upscasting => an toan
//        Animal a = new Dog();
//        //b2 : downcasting => rui ro
//        Cat c = (Cat) a;
//        //b3 : goi ham
//        c.makeSound();
//        // bien dich javac Main.java => khong co loi vi Cat la lop con cua Animal
//        // chay java Main => co loi, no kiem tra doi tuong that : Dog va Cat 2 nhanh ae khong lien quan

        // sua lai code sau khi dung "instanceof"
        Animal a = new Dog();
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.makeSound();
        }
        else{
            System.out.println("Day khong phai la Meo!");
        }
    }
}
