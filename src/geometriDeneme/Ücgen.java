package geometriDeneme;

public class Ücgen extends Ortak {

    public Ücgen(double uzunKenar, double kisaKenar, double digerKenar) {
        super(uzunKenar, kisaKenar, digerKenar);
    }


    public double cevreHesaplaÜcgen() {
        return super.cevreHesaplaÜcgen();
    }

    @Override
    public String toString() {
        return "Ücgenin kisa kenari : " + kisaKenar + "\nÜcgenin uzun kenari : " + uzunKenar + "\nÜcgenin diger kenari : " + digerKenar +
                "\nÜcgenin cevresi : " + cevreHesaplaÜcgen();
    }
}
