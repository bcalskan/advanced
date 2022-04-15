package geometriDeneme;

public class Ortak {

    double kisaKenar;
    double uzunKenar;
    double yaricap;
    int kenar;
    double digerKenar;


    public Ortak() {

    }


    public Ortak(int kenar) {
        this.kenar = kenar;

    }

    public Ortak(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Ortak(double kisaKenar, double uzunKenar, double digerKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
        this.digerKenar = digerKenar;
    }

    public Ortak(double yaricap) {
        this.yaricap = yaricap;
    }

    public double cevreHesapla() {
        return (uzunKenar + kisaKenar) * 2;
    }

    public double alanHesapla() {
        return (uzunKenar * kisaKenar);
    }

    public double alanHesaplaCember() {
        return (yaricap * yaricap * 3.14);
    }

    public double cevreHesaplaCember() {
        return yaricap * 2 * 3.14;
    }

    public double cevreHesaplaKare() {
        return (kenar * 4);
    }

    public double alanHesaplaKare() {
        return (kenar * kenar);
    }

    public double cevreHesaplaÜcgen() {
        return (uzunKenar + kisaKenar + digerKenar);
    }


}
