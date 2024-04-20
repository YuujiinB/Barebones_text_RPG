package org.example;
import java.util.Scanner;

public class NextRoom  {
    public void going(){
        Scanner direction = new Scanner(System.in);
        System.out.println("Which room do you wish to enter?");
        System.out.println("North?   " + "East?");
        System.out.println("South?   " + "West?");
        String confirmDirection = (direction.nextLine().toLowerCase());

        switch(confirmDirection){
            case "north":
                System.out.println("Going north");
                Direction northRoom = new Direction();
                northRoom.north();
                break;
            case "east":
                System.out.println("Going east");
                Direction eastRoom = new Direction();
                eastRoom.east();
                break;
            case "south":
                System.out.println("Going south");
                Direction southRoom = new Direction();
                southRoom.south();
                break;
            case "west":
                System.out.println("Going west");
                Direction westRoom = new Direction();
                westRoom.west();
                break;

        }
    }
}
