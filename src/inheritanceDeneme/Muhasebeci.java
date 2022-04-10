package inheritanceDeneme;

public class Muhasebeci extends Personel {
    String statü = "Muhasebeci";
    String hak = "Muhasebeciler evden calisma hakkina sahiptirler.";
    String izin = "Muhasebeciler ayda 3 gün izin alabilirler";

    public void mesaiSaatleri() {
        System.out.println("Tüm muhasebeciler 5 gün, günde 8 saat calisir");
    }

    public void maas() {
        System.out.println("Tüm muhasebeciler 30 gün * 8 saat * 10 euro = " + (30 * 8 * 10) + " Euro maas alir");

    }

    public static void main(String[] args) {

        Muhasebeci ali = new Muhasebeci();
        System.out.println(ali.statü);
        System.out.println(ali.hak);
        System.out.println(ali.izin);
        System.out.println(ali.ikramiyeler);
        ali.mesaiSaatleri();
        ali.maas();


    }

}
