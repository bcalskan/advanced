package inheritance;

public class Hayvanlar {

    protected String hareket = "Tüm hayvanlar hareket eder";
    protected String solunum = "Tüm hayvanlar nefes alirlar";
    protected String beslenme = "Tüm hayvanlar beslenirler";
    protected String ölüm = "Tüm hayvanlar ölürler";

    public static void beslenmeAraligi() {
        System.out.println("Hayvanlar günlük beslenmelidirler");

    }

    public static void temizlik() {
        System.out.println("Tüm hayvanlar günlük temizlenmelidir");
    }
}




