package Projects.arabaKirala;

public class AracTalepEt {

    public AracTalepEt() {
    }

    private String sehir;
    private String alinacakGün;
    private double alisSaati;
    private String teslimGünü;
    private double teslimSaati;

    private String marka;
    private String model;
    private String yakit;
    private String vites;
    private double günlükKira;

    public AracTalepEt(String sehir, String alinacakGün, double alisSaati, String teslimGünü, double teslimSaati) {
        this.sehir = sehir;
        this.alinacakGün = alinacakGün;
        this.alisSaati = alisSaati;
        this.teslimGünü = teslimGünü;
        this.teslimSaati = teslimSaati;
    }

    public AracTalepEt(String marka, String model, String yakit, String vites, double günlükKira) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.vites = vites;
        this.günlükKira = günlükKira;
    }

    @Override
    public String toString() {
        return "AracTalepEt{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", vites='" + vites + '\'' +
                ", günlükKira=" + günlükKira +
                '}';
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getAlinacakGün() {
        return alinacakGün;
    }

    public void setAlinacakGün(String alinacakGün) {
        this.alinacakGün = alinacakGün;
    }

    public double getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(double alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGünü() {
        return teslimGünü;
    }

    public void setTeslimGünü(String teslimGünü) {
        this.teslimGünü = teslimGünü;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGünlükKira() {
        return günlükKira;
    }

    public void setGünlükKira(double günlükKira) {
        this.günlükKira = günlükKira;
    }
}
