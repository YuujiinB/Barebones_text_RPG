package org.example;

public class Slime {
    private int slimeHP;
    private int slimeDamage;

    public Slime(int slimeHP, int slimeDamage) {
        this.slimeHP = slimeHP;
        this.slimeDamage = slimeDamage;
    }

    @Override
    public String toString() {
        return "slime{" +
                "slimeHP=" + slimeHP +
                ", slimeDamage=" + slimeDamage +
                '}';
    }

    public int getSlimeHP() {
        return slimeHP;
    }

    public void setSlimeHP(int slimeHP) {
        this.slimeHP = slimeHP;
    }

    public int getSlimeDamage() {
        return slimeDamage;
    }

    public void setSlimeDamage(int slimeDamage) {
        this.slimeDamage = slimeDamage;
    }
}
