package Pertemuan1.Tugas;
public class Kipas {
    public String brand;
    public int level;

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void setLevel(int speed) {
        if (speed >=0 && speed <= 3) {
            this.level = speed;
        } else {
            System.out.println("Error! Kipas hanya bisa level 0 - 3");
        }
    }

    public void nyalakan() {
        System.out.println("Kipas merk " + brand + " dinyalakan");
    }

    public void matikan() {
        System.out.println("Kipas merk " + brand + " dimatikan");
    }

    public void cetakInformasi() {
        System.out.println("Kipas merk : " + brand);
        System.out.println("Kecepatan level kipas : " + level);
    }
}