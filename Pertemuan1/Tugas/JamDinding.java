package Pertemuan1.Tugas;

public class JamDinding {
    public String merk;
    public String bentuk;

    public void gantiBaterai() {
        System.out.println("Baterai dari jam dinding merk " + merk + " berhasil diganti");
    }

    public void setWaktu(String waktu) {
        System.out.println("Waktu jam dinding disesuaikan pada pukul : " + waktu);
    }

    public void cetakInformasi() {
        System.out.println("Merk : " + merk);
        System.out.println("Bentuk Frame : " + bentuk);
    }
}
