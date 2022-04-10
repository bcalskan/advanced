package constructorDeneme;

public class Bilet {
    String isim;
    String soyIsim;
    String otobüsFirmasi;
    String rota;
    String kalkisSaati;
    int yas;
    int koltukNumarasi;

    public Bilet(String isim, String soyIsim, String otobüsFirmasi, String rota, String kalkisSaati, int yas, int koltukNumarasi) {

        this.isim = isim;
        this.soyIsim = soyIsim;
        this.otobüsFirmasi = otobüsFirmasi;
        this.rota = rota;
        this.kalkisSaati = kalkisSaati;
        this.yas = yas;
        this.koltukNumarasi = koltukNumarasi;
    }

    public Bilet() {
    }

    public String toString() {
        String biletBilgileri = "Isim : " + isim + " \nSoyisim : " + soyIsim +
                " \nYas : " + yas + " \nFirma adi : " + otobüsFirmasi +
                " \nYolculuk : " + rota + " \nKalkis saati : " + kalkisSaati +
                " \nKoltuk numarasi : " + koltukNumarasi;

        return biletBilgileri;
    }


}
