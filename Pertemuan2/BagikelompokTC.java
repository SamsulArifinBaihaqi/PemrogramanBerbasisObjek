package Pertemuan2;

public class BagikelompokTC {
    public static void main(String[] args) {
        System.out.println("Awal Program");

        int jumlahMahasiswa = 32;
        int jumlahKelompok = 0;
        int anggotaPerKelompok = 0;

        try {
           anggotaPerKelompok = jumlahMahasiswa / jumlahKelompok; 
        } catch (ArithmeticException e) {
            System.out.println("Jumlah Kelompok Tidak Boleh Nol");
        }

        System.out.println(anggotaPerKelompok);
        System.out.println("Akhir Program");
    }
}
