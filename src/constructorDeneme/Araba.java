package constructorDeneme;

public class Araba {

    String marka = "Opel";
    String mensei = "Almanya";
    String model;
    int yil;

    public Araba(String marka, String model, int yil, String yakit, boolean elektrikliMi) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
        this.elektrikliMi = elektrikliMi;
        maxHiz = maxHizlanma();
        otomatikPilot = otomatikPilotSorgula();
    }

    String yakit;
    boolean otomatikPilot = otomatikPilotSorgula();

    private boolean otomatikPilotSorgula() {
        boolean sonuc = false;
        if (elektrikliMi) {
            sonuc = true;
        }
        return sonuc;
    }

    boolean elektrikliMi;
    int maxHiz = maxHizlanma();

    private int maxHizlanma() {
        int mac = 0;

        if (elektrikliMi) {
            maxHiz = 150;
        } else {
            maxHiz = 220;
        }
        return maxHiz;
    }


    public Araba() {

    }

    public String toString() {
        String arabaÖzellik = "Model : " + model +
                " Yakit : " + yakit +
                " Max hiz : " + maxHiz +
                " Mensei : " + mensei;
        return arabaÖzellik;
    }


}
