package si_regpagi_22166030_latihan24_perbandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program perbandingan dua buah nilai yang inputannya berasal dari user.
 */
public class SI_RegPagi_22166030_Latihan24_PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Variabel
        String ulangi;
        
        //Memnampilkan judul
        System.out.println("=====Perbandingan Dua Buah Nilai=====");
        
        //Menggunakan kondisi perulangan do-while loop
        do {
            System.out.print("Masukkan nilai pertama \t: ");
            int nilaiPertama = input.nextInt();

            System.out.print("Masukkan nilai kedua \t: ");
            int nilaiKedua = input.nextInt();
            
            //Membandingkan dua buah nilai
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            
            System.out.println("\n");
            
            //Mengulangi langkah-langkah jika kondisi terpenuhi
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            ulangi = input.next();
            System.out.println("\n");
        } while (ulangi.equalsIgnoreCase("Ya"));

        //Menutup objek
        input.close();
    }
}
