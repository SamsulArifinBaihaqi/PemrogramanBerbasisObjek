package Pertemuan1.Tugas;

public class KipasGenggam extends Kipas {
    public String warna;
    public int presBaterai;

    public void cekBaterai() {
        System.out.println("Baterai Kipas Portable saat ini  : " + presBaterai + "%");
    }

    public void charge() {
        System.out.println("Kipas Portable saat ini : dalam mode isi daya");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna : " + warna);
        System.out.println("Baterai : " + presBaterai);
    }
}
