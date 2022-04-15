package geometriDeneme;

public class Kare extends Ortak {

    public Kare(int kenar) {
        super(kenar);
    }

    public double alanHesaplaKare() {
        return super.alanHesaplaKare();
    }

    public double cevreHesaplaKare() {
        return super.cevreHesaplaKare();
    }


    @Override
    public String toString() {
        return "Karenin kenari : " +kenar+"\nKarenin alani : "+alanHesaplaKare()+"\nKarenin cevresi : "+cevreHesaplaKare();

    }
}
