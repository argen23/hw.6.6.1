package com.argen;

public class Boss extends GameEntity {
    Weapon Boss;

    public String printInfo() {
        return getBoss().getHouseHold() + "\n" + getBoss().getSteelArms() +
                "\n" + getBoss().getRifle() +
                " \nHealth: " + getHealth() + " \nDamage : " +
                getDamage();
    }


    public Boss(int health, int damage, Weapon boss) {
        super(health, damage);
        Boss = boss;
    }

    public Weapon getBoss() {
        return Boss;
    }

    public void setBoss(Weapon boss) {
        Boss = boss;
    }
}


