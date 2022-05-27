package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor {
    private String username;
    private String password;
    private HashMap <Saham,Integer> pesanan = new HashMap<Produk,Integer>();
    private String nama;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }
}
