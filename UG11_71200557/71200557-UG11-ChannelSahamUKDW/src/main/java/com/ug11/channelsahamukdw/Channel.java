package com.ug11.channelsahamukdw;

import java.util.Locale;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;

    public Channel(){}

    public void login(String email) throws EmailException{
        try {
            String[] newemail = email.split("@");
            String[] domain = newemail[1].split("[.]");
            String[] flname = newemail[0].split("[.]");

            if (domain[0].equals("students") && domain[1].equals("ukdw")
                    && domain[2].equals("ac") && domain[3].equals("id")){
                if(flname.length == 2){
                    this.namaDepan = flname[0].toUpperCase();
                    this.namaBelakang = flname[1].toUpperCase();
                    this.email = email;
                    System.out.println("Login berhasil!");
                }else {
                    throw new EmailException(2);
                }
            }else {
                throw new EmailException(1);
            }

        }catch (EmailException e){
            System.out.println("Error: "+e.getErrorMessage());
        }

    }

    public void bagikanIde (String ide){
        String [] kata = ide.split("\\s+");
        String tag = "-";
        int sahamSkrng = 0;
        for(String i : kata){
            String at = String.valueOf(i.charAt(0));
            if(at.equals("#")){
                tag = "";
                tag += i+", ";
                sahamSkrng += 1;
                setTotalTag(getTotalTag()+1);
            }
        }

        System.out.println("Ide: "+ide);
        System.out.println("Saham yang Anda tag: "+tag);
        System.out.println("Total saham yang Anda tag: "+sahamSkrng);

    }
    public void printInfo(){
        System.out.println("Nama Depan : "+getNamaDepan());
        System.out.println("Nama Belakang : "+getNamaBelakang());
        System.out.println("Email : "+getEmail());
        System.out.println("Total tag : "+getTotalTag());
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getTotalTag() {
        return totalTag;
    }

    public void setTotalTag(int totalTag) {
        this.totalTag = totalTag;
    }
}
