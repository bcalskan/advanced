package constructorDeneme;

public class Ögrenci {
    String isim;
    String soyIsim;
    String okulNo;

    public Ögrenci() {
    }

    public Ögrenci(String isim, String soyIsim, String okulNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.okulNo = okulNo;
    }

    public String toString() {
        String özellik = "Ogrenci adi : " + isim + " \nÖgrenci soyadi : " + soyIsim +
                " \nÖgrenci okul numarasi : " + okulNo;
        return özellik;
    }


}
