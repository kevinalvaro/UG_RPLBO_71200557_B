package com.ug8.minidota;

public class Warlock extends Hero implements Summoner {
    private int numOfSummon;
    public Warlock(){super("Warlock",80,700);}

    @Override
    public void attack(Creep c) {
        c.attacked(this.getDamage());
    }
    @Override
    public Golem summon() {
        this.setNumOfSummon(getNumOfSummon()+1);
        return new Golem(this);

    }
    @Override
    public Character summon() {
        numOfSummon += 1;
        Golem g = new Golem();
    }
    public void setNumOfSummon(int numOfSummon) {
        this.numOfSummon = numOfSummon;
    }

    public int getNumOfSummon() {
        return numOfSummon;
    }
}
