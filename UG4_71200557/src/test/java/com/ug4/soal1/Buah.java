package com.ug4.soal1;

public class Buah {
    private String nama;
    private int jumlah;
    private int masaPanen;
    private int lamaBertahan;


    public String getNama(){
        return nama;
    }

    private void setNama(String namabaru){
        nama = namabaru;
    }

    //------------------------------------------
    public int getJumlah(){
        return jumlah;
    }

    private void setJumlah(int jumlahbaru){
        this.jumlah = jumlahbaru;
    }
    //------------------------------------------
    public int getMasaPanen(){
        return jumlah;
    }

    private void setMasaPanen(int masaPanenBaru){
        this.masaPanen = masaPanenBaru;
    }
    //------------------------------------------
    public int getLamaBertahan(){
        return lamaBertahan;
    }

    private void setLamaBertahan(int lamaBertahanbaru){
        this.lamaBertahan = lamaBertahanbaru;
    }

}
