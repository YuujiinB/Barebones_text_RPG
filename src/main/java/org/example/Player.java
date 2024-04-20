package org.example;

public class Player {
    private int hp;
    private String itemName;
    private int itemDamage;

    public Player(int hp, String itemName, int itemDamage) {
        this.hp = hp;
        this.itemDamage = itemDamage;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "player{" +
                "hp=" + hp +
                ", itemName='" + itemName + '\'' +
                ", itemDamage=" + itemDamage +
                '}';
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemDamage() {
        return itemDamage;
    }

    public void setItemDamage(int itemDamage) {
        this.itemDamage = itemDamage;
    }
}
