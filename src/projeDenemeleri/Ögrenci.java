package projeDenemeleri;

public class Ögrenci extends Kisiler {


    private String ögrenciNumarasi;
    private String sinif;

    public Ögrenci() {

    }

    public Ögrenci(String ögrenciNumarasi, String sinif) {
        this.ögrenciNumarasi = ögrenciNumarasi;
        this.sinif = sinif;
    }


    public Ögrenci(String adSoyad, String kimlikNumarasi, int yas, String ögrenciNumarasi, String sinif) {
        super(adSoyad, kimlikNumarasi, yas);
        this.ögrenciNumarasi = ögrenciNumarasi;
        this.sinif = sinif;
    }


    public String getÖgrenciNumarasi() {
        return ögrenciNumarasi;
    }

    public void setÖgrenciNumarasi(String ögrenciNumarasi) {
        this.ögrenciNumarasi = ögrenciNumarasi;
    }

    public String getSinif() {
        return sinif;
    }

    @Override
    public String toString() {
        return "Ögrenci{" +
                "ögrenciNumarasi='" + ögrenciNumarasi + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}

