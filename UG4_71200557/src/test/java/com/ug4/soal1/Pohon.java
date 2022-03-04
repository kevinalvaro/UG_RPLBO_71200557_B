package com.ug4.soal1;
import java.time.LocalDate;



public class Pohon {
    private int daun;
    private int akar;
    private int dahan;
    private static final int MASAHIDUP = 10;
    private int umur;
    private Buah buah;
    private Musim musim;
    private LocalDate tanggalMusim;

    public Pohon(int daun, int akar, int dahan, int umur){
        this.setDaun(daun);
        this.setAkar(akar);
        this.setDahan(dahan);
        this.setUmur(umur);
    }




    //------------------------------------------
    public int getDaun(){
        return daun;
    }

    private void setDaun(int daunBaru){
        this.daun = daunBaru;
    }

    //------------------------------------------
    public int getAkar(){
        return akar;
    }

    private void setAkar(int akarBaru){
        this.akar = akarBaru;
    }

    //------------------------------------------
    public int getDahan(){
        return dahan;
    }

    private void setDahan(int dahanBaru){
        this.dahan = dahanBaru;
    }
    //------------------------------------------
    public static int getMasahidup(){
        return MASAHIDUP;
    }
    //------------------------------------------
    public int getUmur(){
        return umur;
    }

    private void setUmur(int umurBaru){
        this.umur = umurBaru;
    }

    //------------------------------------------
    public Buah getBuah(){
        return this.buah;
    }

    private void setBuah(Buah buahBaru){
        this.buah = buahBaru;
    }

    //------------------------------------------
    public Musim getMusim(){
        return this.musim;
    }

    public void setMusim(Musim musimBaru){
        this.musim = musimBaru;
    }



}
