package com.ug14.rumahsakit;

import java.sql.*;
import java.util.Scanner;

public class Pelayanan extends DAO{
    private int idPelayan = 0;
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public Pelayanan(){}

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) throws SQLException {
        if(!pasien.getStatus()){
            jadwal.setDokter(dokter);
            jadwal.setPasien(pasien);
            jadwal.setStatusDaftar(true);
            jadwal.setPelayanan(this);
            super.inputJadwal(jadwal);

        }
    }

    public Pasien registrasi() throws SQLException {
        Scanner nomorRM = new Scanner(System.in);
        System.out.print("RM : ");
        int RM = nomorRM.nextInt();

        Scanner inpnama = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaPengunjung = inpnama.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        int usiaPengunjung= inpnama.nextInt();

        Scanner inputalamat = new Scanner(System.in);

        System.out.print("Masukkan alamat anda : ");
        String alamatPengunjung= inputalamat.nextLine();

        Scanner inppenyakit = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitPengunjung = inppenyakit.nextLine();

        Pasien pasien = new Pasien(RM,namaPengunjung,usiaPengunjung,alamatPengunjung,penyakitPengunjung);
        super.inputPasien(pasien);
        System.out.println("========Proses Registrasi Anda Berhasil!========");
        return pasien;
    }


    public int getIdPelayan() {
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
