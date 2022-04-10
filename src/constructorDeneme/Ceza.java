package constructorDeneme;

public class Ceza {
    String isimSoyIsim;
    String arabaMarkasi;
    String arabaModeli;
    String plaka;
    String sehir;
    int yas;
    double hiz;
    //double ceza = hizSorgulama();

    private double hizSorgulama() {
        double ceza = 0;
        if (hiz > 150) {
            ceza+=hiz*2;
            System.out.println("Cezaniz : " + ceza + " $");

        }else if (hiz<150 && hiz>=100) {
            ceza+=hiz;

        }else System.out.println("Hiz sinirini asmadiginiz icin ceza ödemek zorunda degilsiniz. \n*** Iyi Yolculuklar ***");

        return ceza;
    }

    public Ceza() {
    }

    public String toString() {
        String cezaÖdeme = "Isim-Soyisim : " + isimSoyIsim + "\nYas : " + yas +
                "\nAraba Markasi ve Modeli : " + arabaMarkasi + " " + arabaModeli +
                "\nPlaka : " + plaka + "\nSehir : " + sehir + "\nHiz : " + hiz+
                "\nCeza Tutari : " +hizSorgulama() +"$";
        return cezaÖdeme;
    }


}
