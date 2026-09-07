public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman tr1 = new Peminjaman();
        Peminjaman tr2 = new Peminjaman();
        Peminjaman tr3 = new Peminjaman();

        tr1.idTransaksi = "TRX7125";
        tr1.namaPeminjam = "Abdul";
        tr1.judulBuku = "Dasar Pemograman";
        tr1.jumlahHariTerlambat = 0;
        tr1.tampilInfoPeminjaman();
        
        System.out.println("--------------------------------");

        tr2.idTransaksi = "TRX1236";
        tr2.namaPeminjam = "Nazul Karim";
        tr2.judulBuku = "Matematika Diskrit";
        tr2.jumlahHariTerlambat = 3;
        tr2.tampilInfoPeminjaman();
        
        System.out.println("--------------------------------");

        tr3.idTransaksi = "TRX8239";
        tr3.namaPeminjam = "Indah Permata";
        tr3.judulBuku = "Kewarganegaraan";
        tr3.jumlahHariTerlambat = 10;
        tr3.tampilInfoPeminjaman();
    }
}
