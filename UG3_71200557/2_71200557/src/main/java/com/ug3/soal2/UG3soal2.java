package com.ug3.soal2;
import java.util.concurrent.TimeUnit;

public class UG3soal2 {
    public static void main(String[] args)throws InterruptedException{
        System.out.println("Lampu merah menyala selama");

//===================== Lampu merah========================
        for(int i = 20; i > 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Akan berganti ke lampu kuning");
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(2);

        //===================== Lampu kuning========================
        System.out.println("Lampu kuning menyala selama");
        for(int i = 2; i > 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Akan berganti ke lampu hijau");
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        //===================== Lampu hijau========================
        System.out.println("Lampu hijau menyala selama");
        for(int i = 15; i > 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println(" ");
        System.out.println("Akan berganti ke lampu kuning");
        TimeUnit.SECONDS.sleep(2);
        //===================== Lampu kuning========================
        System.out.println("Lampu kuning menyala selama");
        for(int i = 2; i > 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }

        //===================== Lampu merah========================
        System.out.println("Akan berganti ke lampu merah");
        System.out.println(" ");

        System.out.println("Lampu merah menyala selama");
        for(int i = 20; i > 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
