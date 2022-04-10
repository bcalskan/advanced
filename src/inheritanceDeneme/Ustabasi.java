package inheritanceDeneme;

public class Ustabasi extends Isci {
    String statü ="Ustabasi";
    String hak ="Ustabasi bazi haklara sahiptir";
    String izin ="Ustabasi yilda 4 gün izin kullanabilir.";

    public void mesaiSaatleri(){
        System.out.println("Ustabasi 5 gün, günde 10 saat calismak zorundadir.");
    }

    public void maas(){
        System.out.println("Ustabasi maasi 30 gün * 10 saat * 13 Euro = "+(30*10*13));
    }

}
