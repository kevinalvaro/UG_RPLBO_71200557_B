package com.ug9.mobilelegend;

public class Hero extends Character{
    private int healthBonus;
    private int level =1;
    private int healthMax;
    private int lifeSteal =50;

    public Hero(String name ,int damage, int health){
        super(name, damage, health);
    }
    @Override
    public void attack(Character enemy) {
        if(!enemy.isDie() || !this.isDie()){
            enemy.setHealth(enemy.getHealth()-this.getDamage());
            if (enemy.getHealth() <= 0){
                enemy.setHealth(0);
                enemy.setDie(true);
                this.level+=1;

                if (enemy instanceof Melee || enemy instanceof Ranged){
                    this.lifeSteal += 150;

                }else {
                    this.setHealth(this.getHealth()+this.healthBonus);
                    if (this.getHealth() > this.healthMax){
                        this.setHealth(this.healthMax);
                    }
                }
            }
        }
    }
    public void addDamage(int damageBonus){
        this.setDamage(this.getDamage() + damageBonus);


    }
    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getLevel() {
        return level;
    }


}
