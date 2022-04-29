package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{

    public Melee(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {
        this.setDamage(this.getDamage()+150);
        System.out.println(this.getName()+ " Ultimate Aktif damagenya bergambah sebanyak 150");
    }

    @Override
    public void attack(Character enemy) {
        if(enemy instanceof Creep){
            this.setHealthBonus(this.getHealth()+200);
            super.attack(enemy);

        }else {
            super.attack(enemy);
        }
    }
}
