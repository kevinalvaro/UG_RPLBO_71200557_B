package com.ug11.kalkulasirupiah;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner inputt = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String persen = inputt.nextLine();
        // pisah berdasarkan white space
        String[] kata = persen.split("\\s+");
        String detail = "";
        float hasil = 0;
        for (String x : kata){
            String checkpersen = String.valueOf(x.charAt(x.length()-1));
            if(checkpersen.equals("%")){
                String angka = x.split("%")[0];
                try {
                    detail = detail + x + " + ";
                    hasil = hasil + Float.parseFloat(angka);
                }catch (NumberFormatException e){
                    continue;
                }
            }else{
                continue;
            }
        }
        if(detail == ""){detail = "-";
        }else {detail = detail.substring(0,detail.length()-3);}

        System.out.println("Rincian perhitungan: "+detail);
        System.out.println("Total kenaikan (Dalam Persen): "+ hasil + "%");
    }
}

