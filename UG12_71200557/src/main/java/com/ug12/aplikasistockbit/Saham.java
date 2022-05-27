package com.ug12.aplikasistockbit;

public class Saham {
    private long harga;
    private String kode;


public Saham(String kode, long harga){
    this.harga = harga;
    this.kode = kode;
}

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}

