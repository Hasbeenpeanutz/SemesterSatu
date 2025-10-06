package jobsheet.quiz;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {

        Scanner ans = new Scanner (System.in);

        System.out.print("Choose questions: ");
        int number = ans.nextInt();

        switch (number) {
            case 1:
                soal.A();
                break;
        
            case 2:
                soal.B();
                break;

            case 3:
                soal.C();
                break;
            
            case 4:
                soal.D();
                break;
        }
    }
}

class soal{
    public static void A() {
        Scanner ans = new Scanner (System.in);
        
        System.out.print("Masukan panjang kertas (cm): ");
        double panjang_cm = ans.nextDouble();
        System.out.print("Masukan lebar kertas (cm): ");
        double lebar_cm = ans.nextDouble();

        
        double panjang_inch = panjang_cm / 2.54;
        double lebar_inch = lebar_cm / 2.54;
        double luas = panjang_inch * lebar_inch;

        double tarif = 1500 * luas;

        System.out.println("===========================");
        System.out.println("Tarif (inch): 3.000");
        System.out.println("Panjang kertas (cm): " + panjang_cm);
        System.out.println("Lebar kertas (cm): " + lebar_cm);
        System.out.println("Luas kertas (inch): " + luas);
        System.out.println("---------------------------");
        System.out.println("Harga akhir: Rp" + tarif);
    }

    public static void B(){
        Scanner ans = new Scanner (System.in);

        System.out.print("Lama perjalanan (hari): ");
        double hari = ans.nextDouble(); 
        
        System.out.print("Masukan jarak perjalanan: ");
        double jarak = ans.nextDouble(); 

        System.out.print("Masukan konsumsi BBM (liter/km): ");
        double konsumsi_bbm_perliter = ans.nextDouble(); 
        
        double harga_bbm_perliter = 10000;
        double harga_tol = 60000;
        double jasa_supir_perhari = 300000;

        double biaya_operasional = konsumsi_bbm_perliter * jarak * harga_bbm_perliter;

        double total_biaya_operasional = biaya_operasional + harga_tol + jasa_supir_perhari;

        System.out.println("Total: Rp" + total_biaya_operasional * hari);

    }

    public static void C(){
        Scanner ans = new Scanner (System.in);

        System.out.print("Masukan nilai kuis pertama: ");
        double kuis1 = ans.nextDouble();

        System.out.print("Masukan nilai kuis kedua: ");
        double kuis2 = ans.nextDouble();

        System.out.print("Masukan nilai kuis ketiga: ");
        double kuis3 = ans.nextDouble();

        System.out.print("Masukan nilai UTS: ");
        double nilai_uts = ans.nextDouble();

        System.out.print("Masukan nilai UAS: ");
        double nilai_uas = ans.nextDouble();

        double rata_kuis = ((kuis1 + kuis2 + kuis3)/3) * 0.3 ;
        double uts = nilai_uts * 0.3;
        double uas = nilai_uas * 0.4;

        double akhir = rata_kuis + uts + uas;

        System.out.println(akhir);

    }

    public static void D(){
        Scanner ans = new Scanner (System.in);

        System.out.print("Masukan pemakaian stotage cloud (GB): ");
        double gb = ans.nextDouble();

        double tarif = 80000;
        double konversi = gb / 1000;

        double total = konversi * tarif;
        double ppn = total * 0.11;
        double hasil_akhir = total + ppn;

        System.out.println("Hasil akhir: " + hasil_akhir);
    }

}