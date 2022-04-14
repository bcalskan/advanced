package projeDenemeleri;

public class Kisiler {


    private String adSoyad;
    private String kimlikNumarasi;
    private int yas;

    public Kisiler() {
    }

    public Kisiler(String adSoyad, String kimlikNumarasi, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNumarasi = kimlikNumarasi;
        setYas(yas);
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -1 * yas;
        } else this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisiler" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNumarasi='" + kimlikNumarasi + '\'' +
                ", yas=" + yas;
    }
}
