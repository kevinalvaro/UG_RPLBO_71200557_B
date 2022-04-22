package com.ug8.minidota;

public class Golem extends SummonCharacter implements Summoner{
    private int kill;
    public Golem(Summoner summoner){
        super("Golem",120,1000,summoner);
    }
    public void attack(Creep c){
        c.attacked(this.getDamage());
        if(c.isDie()){
            this.setKill(this.getKill()+1);
        }
    }
    @Override
    public Character summon() {
        if (this.getKill() >= 0) {
            this.setKill(getKill() - 1);
            return new Golem(this);
        } else {
            return null;
        }
    }


    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getKill() {
        return kill;
    }
}





