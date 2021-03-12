package com.argen;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(34);
        boss.setHealth(400);
        System.out.println(boss.getDamage() + " damage \n " + boss.getHealth() + " health \n ");

    }
}