package inheritance;

public class Kediler extends Baliklar {

    protected String hareket = "Kediler yürüyerek hareket ederler";
    protected String solunum = "Kediler cigerleriyle nefes alirlar";
    protected String beslenme = "Kediler et, karaciğer, kemik, süt, yoğurt ve balıkla beslenirler";
    protected String ölüm = "Kediler 10 sene yasarlar";
    protected String x = "Kediler nankördür";

    public static void beslenmeAraligi() {
        System.out.println("Kediler günde 2 defa beslenmelidirler");

    }

    public static void temizlik() {
        System.out.println("Kediler 2 günde 1 defa temizlenmelidir");
    }

    public static void main(String[] args) {

        Baliklar obj = new Kediler();
        System.out.println(obj.hareket);
        System.out.println(obj.solunum);
        System.out.println(obj.beslenme);
        System.out.println(obj.ölüm);
        beslenmeAraligi();
        temizlik();

        System.out.println("************************************");

        Kediler obj1 = new Kediler();
        System.out.println(obj1.hareket);
        System.out.println(obj1.solunum);
        System.out.println(obj1.beslenme);
        System.out.println(obj1.ölüm);
        System.out.println(obj1.x);
        beslenmeAraligi();
        temizlik();


        System.out.println("************************************");

        Hayvanlar obj2 = new Kediler();
        System.out.println(obj2.hareket);
        System.out.println(obj2.solunum);
        System.out.println(obj2.beslenme);
        System.out.println(obj2.ölüm);
        beslenmeAraligi();
        temizlik();


    }
}


