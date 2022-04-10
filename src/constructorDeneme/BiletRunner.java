package constructorDeneme;

public class BiletRunner {
    public static void main(String[] args) {

        Bilet obj1 = new Bilet();
        obj1.isim = "Ismail";
        obj1.soyIsim = "Yurtseven";
        obj1.otobüsFirmasi = "Kamil Koc";
        obj1.rota = "Istanbul-Denizli";
        obj1.kalkisSaati = "21.45";
        obj1.yas = 43;
        obj1.koltukNumarasi = 26;

        System.out.println(obj1.toString());
    }
}
