package com.ug8.minidota;

public abstract class SummonCharacter extends Hero {
    protected Summoner owner;
    public SummonCharacter(String name, int damagae, int health, Summoner owner) {
        super(name, damagae, health);
        this.owner = owner;
    }
}
