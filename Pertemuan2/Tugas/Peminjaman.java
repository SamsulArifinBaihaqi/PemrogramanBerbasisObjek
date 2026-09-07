public class Peminjaman {
    public String idTransaksi;
    public String namaPeminjam;
    public String judulBuku;
    public int jumlahHariTerlambat;
    public int totalDenda;

    public int hitungDenda() {
        totalDenda = jumlahHariTerlambat * 1000;
        return totalDenda;
    }

    public void tampilInfoPeminjaman() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nama Peminjam : " + namaPeminjam);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Jumlah Hari Terlambat : " + jumlahHariTerlambat);
        System.out.println("Besar Denda : Rp" + hitungDenda()); 
    }
}