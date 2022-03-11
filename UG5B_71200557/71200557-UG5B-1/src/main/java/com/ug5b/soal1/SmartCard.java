package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(Voucher vch) {
        if (vch.getKode()!=("VC")) {
            String nominalstr = vch.getKode().substring(2);
            Long nominal = Long.parseLong(nominalstr);
            this.saldo += nominal;
            System.out.println("Kode Voucher: "+vch.getKode()+" || Top up sukses! ");
        } else {
            System.out.println("Kode Voucher: VC || Top up gagal! Kode voucher tidak valid.");
        }
    }
}
