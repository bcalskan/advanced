package inheritance;

public class Baliklar extends Hayvanlar {

    String hareket = "Baliklar yüzerek hareket ederler";
    String solunum = "Baliklar solungaclariyla nefes alirlar";
    String beslenme = "Baliklar böcek lavralarla ve kücük baliklarla beslenirler";

    public static void beslenmeAraligi() {
        System.out.println("Baliklar günde 3 defa beslenmelidirler");

    }

    public static void temizlik() {
        System.out.println("Akvaryum haftada 1 defa temizlenmelidir");
    }
}
