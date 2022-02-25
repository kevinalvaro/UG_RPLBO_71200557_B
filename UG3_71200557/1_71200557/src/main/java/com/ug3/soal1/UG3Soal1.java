package com.ug3.soal1;
import java.util.*;


public class UG3Soal1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("=================absensi karyawan========================");
        System.out.println("Absen disini");
        System.out.print("Nama karyawan:");
        String namakaryawan = myObj.nextLine();
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("berhasil absensi");
        System.out.print("Atas nama: "+namakaryawan);

        String month[] = { "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec" };
        String amPm[] = { "AM", "PM" };
        TimeZone tz = TimeZone.getTimeZone("GMT+7:00");
        GregorianCalendar gcal = new GregorianCalendar(tz);
        System.out.println(" ");
        System.out.println("Pada tanggal : "
                +gcal.get(Calendar.DATE)+"-"
                +month[gcal.get(Calendar.MONTH)]+"-"
                + gcal.get(Calendar.YEAR)
        );
        System.out.println("Pukul :"
                        + gcal.get(Calendar.HOUR) + ":"
                + gcal.get(Calendar.MINUTE) + ":"
                + gcal.get(Calendar.SECOND) + " "
                + amPm[gcal.get(Calendar.AM_PM)] + "\n");
    }
}
