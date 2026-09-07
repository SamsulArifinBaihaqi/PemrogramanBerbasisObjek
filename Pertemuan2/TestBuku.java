package Pertemuan2;

public class TestBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.isbn = "978-979-29-6104-2";
        buku1.judul = "Dasar Pemrograman Berbasis Objek";
        buku1.penulis = "Abdul Kadir";
        buku1.tahunTerbit = 2021;
        buku1.tampilInfoBuku();
        
        System.out.println();

        Buku buku2 = new Buku();
        buku2.isbn = "765-897-34-1287-1";
        buku2.judul = "Matematika Dasar";
        buku2.penulis = "M. Samsul Arifin Baihaqi";
        buku2.penerbit = "Citra Book";
        buku2.tahunTerbit = 2029;
        buku2.tampilInfoBuku();

        System.out.println();

        Buku buku3 = new Buku();
        buku3.isbn = "672-761-39-0912-6";
        buku3.judul = "Fisika";
        buku3.penulis = "Abdillah Baihaqi";
        buku3.penerbit = "Baihaqi Company";
        buku3.tahunTerbit = 2028;
        buku3.tampilInfoBuku();
    }
}
