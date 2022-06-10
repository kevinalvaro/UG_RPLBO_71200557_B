package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {

    public Suster getSusterByID(int idSuster) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM pelayanan where idSuster="+idSuster;
        ResultSet rs = statement.executeQuery(sql);
        String inpNama = "";
        while (rs.next())
        {
            int id = rs.getInt("idPelayan");
            String nama = rs.getString("nama");

            // print the results
            System.out.format("%s, %s\n", id, nama);
        }
        statement.close();
        Suster suster = new Suster(0,inpNama);
        return suster;
    }

    public Dokter getDokterByID(int idDokter) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM dokter where idDokter="+idDokter;
        ResultSet rs = statement.executeQuery(sql);
        String inpnama = "";
        String inpspes = "";
        String inpruang = "";
        while (rs.next())
        {
            int id = rs.getInt("idDokter");
            String nama = rs.getString("nama");
            inpnama = nama;
            String spesialis = rs.getString("spesialis");
            inpspes = spesialis;
            String ruangan = rs.getString("ruangan");
            inpruang = ruangan;

            // print the results
            System.out.format("%s, %s, %s, %s\n", id, nama, spesialis, ruangan);
        }
        statement.close();
        Dokter dokter = new Dokter(0,inpnama,inpspes,inpruang);
        return dokter;
    }
    public void inputPasien(Pasien pasien) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        Statement statement = conn.createStatement();
        String sql = "INSERT INTO pasien values ('"+pasien.getRm()+"','"+pasien.getNama()+"','"+pasien.getUsia()+"','"+pasien.getAlamat()+"')";
        statement.executeUpdate(sql);
        System.out.println("Data Pasien Berhasil Disimpan");
    }


    public Pelayanan getPelayananByID(int idPelayan) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM pelayanan where idSuster="+idPelayan;
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next())
        {
            int id = rs.getInt("idPelayan");
            String nama = rs.getString("nama");

            // print the results
            System.out.format("%s, %s\n", id, nama);
        }
        statement.close();
        Pelayanan pelayanan = new Pelayanan();
        return pelayanan;
    }

    public void inputJadwal(Jadwal jadwal){

        int pemeriksaa = jadwal.getIdPemeriksaan();
        int pelayann = 0;
        int rm = jadwal.getPasien().getRm();
        int status = jadwal.getPasien().getStatus() ? 1 : 0;
        int doktorr = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
            Statement statement = conn.createStatement();
            int rs = statement.executeUpdate("INSERT INTO jadwal values ('"+pemeriksaa+"','"+rm+"','"+doktorr+"','"+pelayann+"','"+status+"')");
            System.out.println("Data Jadwal Berhasil Disimpan !!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void getPasienSembuh() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        String sql = "SELECT * FROM jadwal where status=1";
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next())
        {
            int id = rs.getInt("rm");

            // print the results
            System.out.format("%s\n", id);
        }
    }

    public void updateStatusPasien(Pasien pasien) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:E:/File OneDrive/OneDrive - Duta Wacana Christian University/Materi Kuliah/Semester 4/PrRPLBO/UG15/KEvin/RumahSakit.db");
        String sql = "UPDATE jadwal set status = 1 where rm="+pasien.getRm();
        Statement statement = conn.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Statu Pasien Berhasil Di Ubah");
        System.out.println(pasien.getStatus());
        System.out.println(pasien.getRm());


    }

}
