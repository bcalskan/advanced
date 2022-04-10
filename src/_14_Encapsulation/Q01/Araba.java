package _14_Encapsulation.Q01;

public class Araba { //POJO : planing old java object ---> modal Class

    private String model;
    private String renk;
    private int motor;
    private int yil;


    Araba() {  //parametresiz cins

    }


    public Araba(int motor, int yil) { //parametreli ---> haci murat icin
        this.motor = motor;
        this.yil = yil;
    }

    public Araba(String model, String renk, int motor, int yil) { //parametreli

        this.model = model;
        this.renk = renk;
//      this.motor = motor;
//      this.yil = yil;

        setMotor(motor); //cons obj create etmek icin parametre olarak giren motor datasi
                         // setMotor() methodna parametre olarak calisti degeirini aldi
        setYil(yil);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000) {
            System.out.println("Hatali veri girildi");
        } else this.motor = 1200;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil < 0) {
            this.yil = (-1) * yil;
            System.out.println("Girdiginiz verideki hata giderildi.");
        }
        this.yil = yil;
    }


    @Override
    public String toString() { //bu method bu classdan create edilen
        // objelerin fieldlarini stringe cevirir.
        return "Araba : " +
                "model : " + model + '\'' +
                ", renk : " + renk + '\'' +
                ", motor : " + motor +
                ", yil : " + yil;
    }


}
