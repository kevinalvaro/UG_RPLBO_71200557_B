package com.ug7.game;

public class Penyihir extends Karakter
{
    private boolean isAbilityReady;

    public Penyihir(final Player player) {
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
        if (weapon == 2 ) {
            super.buyWeapon(weapon);
            return;
        }else if (weapon == 3){
                super.buyWeapon(weapon);
                return;
        } else {
            System.out.println("Sebagai penyihir kamu hanya boleh membeli tongkat/tongkat sihir!");
        }
    }

    @Override
    public void abilityAttack(final Karakter karakter) {
        if (!this.isAbilityReady) {
            System.out.println("Ability belum aktif!");
        }
        else {
            int heal;
            if (!this.isWalk()) {
                heal = 100;
            }
            else {
                heal = karakter.getHP() / 2;

            }
            System.out.println("Tidak semudah itu, " + karakter.getPlayer().getUsername() + "!");
            super.receiveHP(heal);
        }
    }

    @Override
    public void normalAttack(final Karakter karakter) {
        if (this.isWalk()) {
            int damage = 0;
            if (this.getWeapon() == 1) {
                damage = 20;
            } else if (this.getWeapon() == 2) {
                damage = 60;
            } else if (this.getWeapon() == 3) {
                damage = 25;
            } else if (this.getWeapon() == 4) {
                damage = 50;
            } else {
                damage = 0;
            }
            int kalian = (int) 1.5;
            karakter.receiveDamage(damage * kalian);
            if (karakter.getHP() == 0) {
                this.getPlayer().levelUp();
            }else if(karakter.getHP() < 50) {
                this.isAbilityReady = true;
            }
        }
        else {
            super.normalAttack(karakter);
        }
    }

    @Override
    public void walk(final boolean type) {
        if (!type) System.out.println(this.getPlayer().getUsername() + " terbang! (Lari)");
        super.walk(type);
    }

    @Override
    public void getInfo() {
        System.out.println("[Karakter Penyihir]");
        super.getInfo();
    }
}
