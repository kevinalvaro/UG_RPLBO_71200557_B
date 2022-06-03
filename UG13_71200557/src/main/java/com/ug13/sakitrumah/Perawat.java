package com.ug13.sakitrumah;

public class Perawat {
    private String nama;
    public Perawat(String nama) {
        this.nama = nama;
    }
    public void screening(Pengunjung pengunjung, Jadwal jadwal) {
        if (jadwal.getPengunjung().equals(pengunjung)) {
            if (jadwal.getStatusDaftar()) {
                jadwal.setStatusScreening(true);
            } else {
                System.out.println("====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN====================");
            }
        } else {
            System.out.println("====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN====================");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
