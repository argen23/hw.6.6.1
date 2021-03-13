package com.argen;

public class Sceleton extends Boss{
    private int numsOfArrows;

    public Sceleton(int health, int damage, Weapon boss) {
        super(health, damage, boss);
    }

    public int getNumsOfArrows() {

        return numsOfArrows;
    }

    public String printInfo() {
        return super.printInfo()+getNumsOfArrows();
    }
}
