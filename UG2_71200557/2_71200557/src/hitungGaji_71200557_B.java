import java.util.Scanner;

public class hitungGaji_71200557_B {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Berapa karyawan: ");
        int jmlLoop = inp.nextInt();



        for (int i = 0; i < jmlLoop; i++) {
            System.out.println("Masukan jumlah jam kerja: ");
            int totJamKerja = inp.nextInt();
            if (totJamKerja == 8) {
                System.out.println("Total: Rp.300000.0");
            } else if (totJamKerja < 8) {
                int lesshour = 8 - totJamKerja ;
                int potongan = lesshour * 15000;
                int hasil = 300000 - potongan;
                System.out.println("Potongan: "+potongan);
                System.out.println("Total: "+hasil);
            } else {
                int extrajam = totJamKerja - 8;
                int potongan = extrajam * 15000;
                int hasil = 300000 + potongan;
                System.out.println("Extra payments: "+potongan);
                System.out.println("Total: "+hasil);
            }
        }
    }
}
