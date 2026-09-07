public class MainMatkul {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah();
        MataKuliah mk2 = new MataKuliah();
        MataKuliah mk3 = new MataKuliah();

        mk1.kodeMK = "MK35246";
        mk1.namaMK = "Fisika Dasar";
        mk1.sks = 2;
        mk1.nilaiAngka = 3.5;
        mk1.hitungBobotNilai();
        mk1.tampilData();

        System.out.println("-------------------------------------------");

        mk2.kodeMK = "MK735172";
        mk2.namaMK = "Dasar Pemrograman";
        mk2.sks = 4;
        mk2.nilaiAngka = 3.0;
        mk2.hitungBobotNilai();
        mk2.tampilData();

        System.out.println("-------------------------------------------");
        
        mk3.kodeMK = "MK75341";
        mk3.namaMK = "Design & Pemrograman Web";
        mk3.sks = 4;
        mk3.nilaiAngka = 4.0;
        mk3.hitungBobotNilai();
        mk3.tampilData();
        
        System.out.println("-------------------------------------------");
        
        double totalBobot = mk1.hitungBobotNilai() + mk2.hitungBobotNilai() + mk3.hitungBobotNilai();
        System.out.println("Total Bobot Nilai : " + totalBobot);
    }
}
