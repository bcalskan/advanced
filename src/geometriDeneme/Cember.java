package geometriDeneme;

public class Cember extends Ortak {

    public Cember(double yaricap){
        super(yaricap);
    }


    public double alanHesaplaCember() {
        return super.alanHesaplaCember();
    }

    public double cevreHesaplaCember() {
        return super.cevreHesaplaCember();
    }

    @Override
    public String toString() {
        return "Cembern yaricapi : " +yaricap+"\nCemberin alani : "+alanHesaplaCember()+"\nCemberin cevresi : "+cevreHesaplaCember();

    }
}
