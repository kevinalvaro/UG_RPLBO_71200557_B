package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill{


    public Ranged(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {
        this.setDamage(this.getDamage()+150);
        System.out.println(this.getName()+ " Ultimate Aktif damagenya bergambah sebanyak 150");
    }

    @Override
    public void attack(Character enemy) {

        if(enemy instanceof Minion){
            this.setHealthBonus(this.getHealth()+150);
            super.attack(enemy);
        }
        else{
            enemy.setHealth(enemy.getHealth()-this.getDamage());
            super.attack(enemy);
        }
        attackInformation(enemy, this.getDamage());
    }
}
