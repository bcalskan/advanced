package constructorDeneme;

public class ÖgrenciRunner {

    public static void main(String[] args) {

        Ögrenci obj1 = new Ögrenci();
        obj1.isim = "Ali";
        obj1.soyIsim = "Bulut";
        obj1.okulNo = "1055";

        System.out.println("***** Ögrenci Bilgileri *****\n"+obj1.toString());

        Ögrenci obj2 = new Ögrenci("Berk","Caliskan","1055");
        System.out.println("***** Yeni Ögrenci Bilgileri *****\n"+obj2.toString());

    }


}
