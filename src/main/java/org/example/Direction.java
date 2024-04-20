package org.example;
import java.util.Scanner;

public class Direction {
    public void north(){
        //chances
        int monsterChance = (int)(Math.random() * 101);
        if (monsterChance < 71){
            System.out.println("Monster encounter!");
            Fight mobFight = new Fight();
            mobFight.fightInit();
        } else {
            System.out.println("Treasure!");
        }

        NextRoom continuing = new NextRoom();
        continuing.going();
    }
    public void east(){
        //chances
        int monsterChance = (int)(Math.random() * 101);
        if (monsterChance > 69){
            System.out.println("Monster encounter!");
            Fight mobFight = new Fight();
            mobFight.fightInit();
        } else {
            System.out.println("Treasure!");
        }

        NextRoom continuing = new NextRoom();
        continuing.going();
    }
    public void south(){
        //chances
        int monsterChance = (int)(Math.random() * 101);
        if (monsterChance > 49){
            System.out.println("Monster encounter!");
            Fight mobFight = new Fight();
            mobFight.fightInit();
        } else {
            System.out.println("Treasure!");
        }

        NextRoom continuing = new NextRoom();
        continuing.going();
    }
    public void west(){
        System.out.println("An empty room...");
        System.out.println("Do you wish to exit or continue?");
        System.out.println("Yes   " + "  No");
        Scanner option = new Scanner(System.in);
        String optionChoosen = (option.nextLine().toLowerCase());

        switch(optionChoosen){
            case "yes":
                NextRoom continuing = new NextRoom();
                continuing.going();
            case "no":
                System.out.println("You've exited the dungeon");
                System.exit(0);
            default:
                System.out.println("Enter a valid option");
        }

    }
}
