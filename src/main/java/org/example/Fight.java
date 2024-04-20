package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Fight {
    public void fightInit() {

        System.out.println("Slime Encounter!");
        Scanner option = new Scanner(System.in);

        ArrayList<Player> player = new ArrayList<>();
        ArrayList<Slime> slime = new ArrayList<>();
        player.add(new Player(100, "Rusty Sword", 10));
        slime.add(new Slime(34, 5));
        int playerHP = player.get(0).getHp();
        int slimeHP = slime.get(0).getSlimeHP();
        int potion = 5;

        while (true) {
            Random rand = new Random();
            double attackRandom = (double) (rand.nextInt(33) + 70)/100;
            int playerDamage = (int) Math.floor(player.get(0).getItemDamage() * attackRandom);
            int slimeDamage = (int) Math.floor(slime.get(0).getSlimeDamage() * attackRandom);
            System.out.println("Attack    " + "Block");
            System.out.println("Potion   " + "Run");

            String userChooses = (option.nextLine().toLowerCase());

            switch (userChooses) {
                case "attack":
                    System.out.println("You dealt " + playerDamage + "!");
                    if (attackRandom > 100) {
                        System.out.println("You dealt critical damage!");
                    }
                    slimeHP -= playerDamage;
                    System.out.println("Slime's turn");
                    System.out.println("Slime dealt " + slimeDamage + "!");
                    playerHP -= slimeDamage;
                    if (playerHP < 1){
                        System.out.println("Game Over!");
                        System.exit(0);
                    }

                    if (slimeHP < 1) {
                        System.out.println("Slime defeated!");
                        return;
                    }
                    break;
                case "block":
                    System.out.println("Blocking");
                    System.out.println("Slime's turn");
                    int blockedDamage = (int) Math.floor(slimeDamage * 0.2);
                    System.out.println("Slime dealt " + (slimeDamage - blockedDamage) + "!");
                    System.out.println("You blocked " + blockedDamage + "!");
                    if (playerHP < 1){
                        System.out.println("Game Over!");
                        System.exit(0);
                    }
                    break;
                case "potion":
                    if (potion == 0){
                        System.out.println("No potions");
                        break;
                    } else if (playerHP == 100) {
                    System.out.println("Player have full health");
                    System.out.println("You have " + potion + "potions left");
                    System.out.println("Slime's turn");
                    System.out.println("Slime dealt " + slimeDamage + "!");
                    playerHP -= slimeDamage;
                    } else {
                        potion -= 1;
                        playerHP += 20;
                        if (playerHP > 100) {
                            playerHP = 100;
                        }
                        System.out.println("You have " + potion + "potions left");
                        System.out.println("Slime's turn");
                        System.out.println("Slime dealt " + slimeDamage + "!");
                        playerHP -= slimeDamage;
                        if (playerHP < 1){
                            System.out.println("Game Over!");
                            System.exit(0);
                        }
                    }

                    break;
                case "run":
                    System.out.println("You ran away...");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}