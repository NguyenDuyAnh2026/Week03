package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Robot> robots = new ArrayList<>();

        for(int i=0; i<n; i++){
            String type = sc.next();
            int id = sc.nextInt();
            String name = sc.next();

            switch (type){
                case "DR" : robots.add(new DroneRobot(id, name)); break;
                case "FR" : robots.add(new FishRobot(id, name)); break;
                case "AR" : robots.add(new AmphibiousRobot(id, name)); break;
            }
        }

        for(Robot r : robots){
            r.performMainTask();
            if(r instanceof Flyable)  ((Flyable) r).fly(); //hoi xem r co implements Flyable ko ? => ep kieu downcasting de dung fly()
            if(r instanceof Swimmable)  ((Swimmable) r).swim();
            if (r instanceof GPS)       ((GPS) r).getCoordinates();
            System.out.println();
        }
    }
}
