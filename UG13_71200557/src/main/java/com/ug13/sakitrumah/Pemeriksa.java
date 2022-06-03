package com.ug13.sakitrumah;

public class Pemeriksa {

    private String nama;
    private String spesialis;
    private String ruangan;


    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getStatus() == false){
            System.out.println("================PENGUNJUNG ANDA MASIH SAKIT================");
        }else {
            System.out.println("================SELAMAT PENGUNJUNG ANDA SUDAH SEMBUH DAN SEHAT================");
        }
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal){
        if(jadwal.getStatusScreening()){
            if(pengunjung.getLevelPenyakit() != 0){
                int levelpenyakit = pengunjung.getLevelPenyakit()-1;
                pengunjung.setLevelPenyakit(levelpenyakit);
            }else {
                pengunjung.setStatus(true);
            }
        }else {
            System.out.println("====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN====================");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
}
