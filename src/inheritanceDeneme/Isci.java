package inheritanceDeneme;

public class Isci extends Personel{

    String statu = "Isci";
    String hak = "Isciler patron ne derse o hakka sahiptir";
    String izin = "Isciler izin kullanamazlar";

    public void mesaiSaatleri() {
        System.out.println("Isciler haftada 6 gün, günde 12 saat calismak zorundadir");
    }

    public void maas(){

        System.out.println("Isci maasi 30 gün * 12 saat * 12 Euro = " +(30*12*12));
    }
}
