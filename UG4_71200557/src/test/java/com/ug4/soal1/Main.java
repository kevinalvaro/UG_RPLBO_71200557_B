package com.ug4.soal1;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args){
        initiateMenu();

    }

    private static void initiateMenu(){

        int pilihan = 1;

        System.out.println("===========================");
        System.out.println("Pohon Kehidupan");
        System.out.println("Mari menyiapkan pohon kehidupanmu");
        System.out.println("===========================");
        System.out.print("Berapa banyak daun yang akan dimiliki: ");
        int daun = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Berapa banyak akar yang akan tumbuh: ");
        int akar = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Berapa banyak dahan yang dimiliki: ");
        int dahan = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Masa hidup pohon kamu adlaah "+ Pohon.getMasahidup()+"tahun");
        System.out.print("Berapa umur kamu(tahun): ");
        int umur = scanner.nextInt();
        scanner.nextLine();

        if (umur < Pohon.getMasahidup()){
            Pohon pohon = new Pohon(daun,akar,dahan,umur);
            System.out.println("Pohon kehidupan kamu sudah tumbuh");
        }else{
            System.out.println("Maaf umur melebihi masa hidup pohon kamu");
            System.out.println("\n");
        }


        System.out.println("===========================");
        System.out.println("Pohon Kehidupan");
        System.out.println("Atur pohon kamu agar menjadi pohon yang bermanfaat");
        System.out.println("===========================");

        while (pilihan != 4){
            System.out.println("1. Tampilkan informasi pohon");
            System.out.println("2. Masukkan musim sekarang");
            System.out.println("3. Panen buah");
            System.out.println("4. Keluar");
            System.out.print("Pilihan kamu: ");
            pilihan = scanner.nextInt();

            if (pilihan == 1){
                System.out.println("intip pohonmu Yuk");

            }
        }
    }



}
