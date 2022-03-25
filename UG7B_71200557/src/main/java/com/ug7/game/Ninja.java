package com.ug7.game;

public class Ninja extends Karakter {
    private boolean isAbilityReady;

    public Ninja(final Player player) {
        super(player);
    }

    @Override
    public void buyWeapon(final int weapon) {
        System.out.println("Daftar senjata:");
        System.out.println("1. Pisau");
        System.out.println("2. Tongkat Sihir");
        System.out.println("3. Tongkat ");
        System.out.println("4. Katana");
        System.out.println("Pilihan senjata: " + weapon);
        if (weapon == 1 ) {
            super.buyWeapon(weapon);
            return;
        }else if (weapon == 4){
            super.buyWeapon(weapon);
            return;
        }
        else {
            System.out.println("Sebagai ninja kamu hanya boleh membeli pisau/katana!");
        }
    }

    @Override
    public void abilityAttack(final Karakter karakter) {
        if (!this.isAbilityReady ) {
            System.out.println("Ability belum aktif!");
        }
        else {
            int karakterhp = karakter.getHP();
            int damage = karakterhp / 2;
            if (!this.isWalk()) {
                damage = karakter.getHP();
            }
            karakter.receiveDamage(damage);
            if (karakter.getHP() == 0) {
                this.getPlayer().levelUp();
            }
            System.out.println("Rasakan ini, " + karakter.getPlayer().getUsername() + "!");
        }
    }

    @Override
    public void normalAttack(final Karakter karakter) {
        if (this.getWeapon() == 0) {
            System.out.println("Maaf, " + this.getPlayer().getUsername() + "... Silakan beli senjata terlebih dahulu!");
            return;
        }
        if (this.isWalk()) {
            super.normalAttack(karakter);
        }
        else {
            int damage = 0;
            if (this.getWeapon() == 1) {
                damage = 20;
            } else if (this.getWeapon() == 2) {
                damage = 60;
            } else if (this.getWeapon() == 3) {
                damage = 25;
            } else if (this.getWeapon() == 4) {
                damage = 50;
            }
            int kalian = (int) 1.5;
            karakter.receiveDamage(damage * kalian);
            if (karakter.getHP() == 0) {
                this.getPlayer().levelUp();
            }else if(karakter.getHP() < 50) {
                this.isAbilityReady = true;
            }
        }
    }

    @Override
    public void walk(final boolean type) {
        if (!type) System.out.println(this.getPlayer().getUsername() + " menghilang! (Lari)");
         super.walk(type);
    }

    @Override
    public void getInfo() {
        System.out.println("[Karakter Ninja]");
        super.getInfo();
    }
}