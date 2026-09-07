package Pertemuan1.Tugas;

public class Demo {
    public static void main(String[] args) {
        KipasBerdiri kb = new KipasBerdiri();
        kb.brand = "Maspion";
        kb.level = 2;
        kb.tinggiTiang = 125;
        kb.swing = false;
        kb.nyalakan();
        kb.setKetinggian(130);
        kb.setSwing();
        kb.cetakInformasi();

        System.out.println("----------------------------------------------");

        KipasGenggam kg = new KipasGenggam();
        kg.brand = "MiniFan";
        kg.level = 3;
        kg.warna = "Ungu";
        kg.presBaterai = 85;
        kg.nyalakan();
        kg.cekBaterai();
        kg.charge();
        kg.cetakInformasi();

        System.out.println("----------------------------------------------");

        JamDinding jd = new JamDinding();
        jd.merk = "KaiLock";
        jd.bentuk = "Persegi Lengkung Putih";
        jd.gantiBaterai();
        jd.setWaktu("15:30 WIB");
        jd.cetakInformasi();

        System.out.println("----------------------------------------------");

        BotolMinum bm = new BotolMinum();
        bm.warna = "Hitam Transparan";
        bm.kapasitas = 750;
        bm.isiAir(500);
        bm.minumAir(150);
        bm.cetakInformasi();
    }
}

