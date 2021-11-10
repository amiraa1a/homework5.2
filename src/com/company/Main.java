package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(320);
        boss.setHealth(70);
        boss.setDefence("железная");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefence());
    }
}
