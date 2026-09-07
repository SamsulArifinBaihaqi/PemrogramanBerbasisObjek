public class MainRuangKelas {
    public static void main(String[] args) {
        RuangKelas rk = new RuangKelas();

        rk.kodeRuang = "RK9128";
        rk.namaGedung = "Gedung Teknik Informatika";
        rk.kapasitas = 32;
        rk.jumlahMahasiswa = 28;
        rk.hitungSisaKursi();
        rk.tampilkanInfo();
    }
}
