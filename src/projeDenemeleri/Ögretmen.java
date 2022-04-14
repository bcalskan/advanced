package projeDenemeleri;

public class Ögretmen extends Kisiler {
    private String sicilNumarasi;
    private String bölüm;

    public Ögretmen() {
    }

    public Ögretmen(String adSoyad, String kimlikNumarasi, int yas, String bölüm, String sicilNumarasi) {
        super(adSoyad, kimlikNumarasi, yas);
        this.bölüm = bölüm;
        this.sicilNumarasi = sicilNumarasi;
    }

    public String getSicilNumarasi() {
        return sicilNumarasi;
    }

    public void setSicilNumarasi(String sicilNumarasi) {
        this.sicilNumarasi = sicilNumarasi;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }


    @Override
    public String toString() {
        return "Ögretmen{" +
                "sicilNumarasi='" + sicilNumarasi + '\'' +
                ", bölüm='" + bölüm + '\'' +
                '}';
    }
}
