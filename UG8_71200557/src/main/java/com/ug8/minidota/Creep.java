package com.ug8.minidota;

public class Creep extends Character implements AttackingHero {
    public Creep(String name, int damagae, int health) {
        super(name, damagae, health);
    }

    @Override
    public void attack(Hero hero) {hero.attacked(this.getDamage());}
}
