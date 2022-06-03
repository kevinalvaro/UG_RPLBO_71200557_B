package com.ug13.sakitrumah;
import java.util.Scanner;

public class Pendaftaran {

    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal){
        if(pengunjung.getStatus()){
            System.out.println("=================Pasien tidak sakit===================");
        }else {
            jadwal.setPendaftaran(this);
            jadwal.setStatusDaftar(true);
            jadwal.setPemeriksa(pemeriksa);
            jadwal.setPengunjung(pengunjung);

            System.out.println("==========================Proses Pengaturan Jadwal Berhasil==================");
        }
    }

    public Pengunjung registrasi(){
        Scanner nama = new Scanner(System.in);
        String namapengunjung;
        System.out.print("Masukkan nama anda : ");
        namapengunjung = nama.nextLine();

        Scanner usia = new Scanner(System.in);
        int usiapengunjung;
        System.out.print("Masukkan usia anda : ");
        usiapengunjung = usia.nextInt();

        Scanner alamat = new Scanner(System.in);
        String alamatpengunjung;
        System.out.print("Masukkan alamat anda : ");
        alamatpengunjung = alamat.nextLine();

        Scanner sakit = new Scanner(System.in);
        String penyakitpengunjung;
        System.out.print("Masukkan penyakit anda : ");
        penyakitpengunjung = sakit.nextLine();
        Pengunjung pengunjung = new Pengunjung (namapengunjung,usiapengunjung,alamatpengunjung,penyakitpengunjung);
        System.out.println("=====================Proses Registrasi Anda Berhasil!==========================");
        return pengunjung;

    }

}
