package com.ug8.minidota;

public class LoneDruid extends Hero implements Upgradable,Summoner {
    private int killCreep;
    private int level;

    public LoneDruid() {
        super("Lone Druid", 1800, 140);
    }
    @Override
    public void attack(Creep creep) {
        creep.attacked(this.getDamage());
        if (creep.isDie()){
            this.setKillCreep(this.getKillCreep() + 1);
        }

    }
    @Override
    public Character summon() {
        return new SpiritBear(this);
    }

    @Override
    public void upgrade() {
        if(getKillCreep()>=3){
            this.setLevel(this.getLevel()+1);
            this.setKillCreep(this.getKillCreep()-3);
            this.setName("Lone Druid "+ "Level : "+this.getLevel());
            this.setDamage(this.getDamage()+20);
        }

    }
    public void showCharacterInfo(){
        super.showCharacterInfo();
        System.out.println("Kill Creep \t: "+getKillCreep());
    }

    public SpiritBear summon(){
        return new SpiritBear(this);
    }

    private void getName(String s) {
    }

    public int getKillCreep() {
        return killCreep;
    }

    public void setKillCreep(int killCreep) {
        this.killCreep = killCreep;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


}

