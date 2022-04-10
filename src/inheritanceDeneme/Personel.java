package inheritanceDeneme;

public class Personel {

    public String statü = "Personel";
    public String hak = "Personeller hicbir hakka sahip degildir";
    public String izin = "Personeller yilda 24 gün izin hakkina sahiptir";
    public String ikramiyeler = "Tüm personeller yilda 2 kez ikramiye alirlar.";

    public void mesaiSaatleri() {
        System.out.println("Haftada 4 gün 10 saat");

    }

    public void maas() {
        System.out.println("Personel maasi 30 gün * 10 saat * 8 Euro = " + (30 * 10 * 8));
    }


}
