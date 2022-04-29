package com.ug9.mobilelegend;

public class Minion extends NPC {

    public Minion(String name, int damage, int health) {
        super(name, damage, health);
    }

    public void attack(Character enemy){
        if(enemy instanceof Creep){
            System.out.println("Terjadi Kesalahan minion tidak dapat menyerang creep");

        }else {
            super.attack(enemy);
        }
    }

}
