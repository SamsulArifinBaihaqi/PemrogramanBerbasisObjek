package Pertemuan1.Tugas;

public class BotolMinum {
    public String warna;
    public int kapasitas;

    public void isiAir(int ml) {
        System.out.println("Botol berhasil diisi air sebanyak : " + ml + " ml");
    }

    public void minumAir(int ml) {
        System.out.println("Air didalam botol diminum sebanyak : " + ml + " ml");
    }

    public void cetakInformasi() {
        System.out.println("Warna Botol : " + warna);
        System.out.println("Kapasitas Botol : " + kapasitas + " ml");
    }
}
