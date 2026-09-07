package Pertemuan1.Tugas;

/**
 * KipasBerdiri
 */
public class KipasBerdiri extends Kipas{
    public int tinggiTiang;
    public boolean swing;

    public void setKetinggian(int tinggi) {
        this.tinggiTiang = tinggi;
        System.out.println("Tinggi kipas diatur pada ketinggian " + tinggi + " cm");
    }

    public void setSwing() {
        if (swing == true) {
            swing = false;
            System.out.println("Swing kipas sedang nonaktif");
        } else {
            swing = true;
            System.out.println("Swing kipas sedang aktif");
        }
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Ketinggian Tiang : " + tinggiTiang + " cm");
        System.out.println("Status Swing : " + swing);
    }
}