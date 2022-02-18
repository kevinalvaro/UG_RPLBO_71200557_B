import com.sun.tools.javac.Main;

import java.util.Scanner;

public class UG1B {
    public static void main(String[] args) {
        TabunganBerjangka K_71200557 = new TabunganBerjangka();
        TabunganKonvensional L_71200557 = new TabunganKonvensional();
        System.out.println("Pilihan:" +
                "1. Penyetoran" +
                "2. Penarikan" +
                "3. Lihat Saldo" +
                "Masukan Pilihan: ");
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukan Pilihan: ");
        int pilihan = inp.nextInt();

        if (pilihan == 1) {
            K_71200557.penyetoran(100000);
            System.out.println("---- Tabungan Konvensional-----");
            System.out.println("Penyetoran:"+K_71200557.saldo);
            System.out.println("---- Tabungan Berjangka-----");
            System.out.println("Penyetoran:"+L_71200557.saldo);
        } else if (pilihan == 2) {

            K_71200557.penarikan();
            System.out.println("Good day.");
            System.out.println("---- Tabungan Konvensional-----");
            System.out.println("Penarikan:"+K_71200557.saldo);
            System.out.println("---- Tabungan Berjangka-----");
            System.out.println("Belum jatuh tempo");
        } else if (pilihan == 3) {
            System.out.println("Good day.");
            System.out.println("Saldo K_71200557:"+K_71200557.saldo);

            System.out.println("Saldo L_71200557:"+L_71200557.saldo);
        } else {
            System.out.println("Pilihan tidak valid");

        }
    }
}
