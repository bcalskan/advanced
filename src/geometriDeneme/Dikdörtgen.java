package geometriDeneme;

public class Dikdörtgen extends Ortak {

    public Dikdörtgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    public double cevreHesapla() {
        return super.cevreHesapla();
    }

    public double alanHesapla() {
        return super.alanHesapla();
    }

    @Override
    public String toString() {
        return "Dikdörtgenin kisa kenari : " + kisaKenar+"\nDikdörtgenin uzun kenari : "+uzunKenar+"\nDikdörtgenin alani : "+alanHesapla()+
                "\nDikdörtgenin cevresi : "+cevreHesapla();
    }





}
