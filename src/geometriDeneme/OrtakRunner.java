package geometriDeneme;

public class OrtakRunner {
    public static void main(String[] args) {

        Dikdörtgen dik = new Dikdörtgen(10, 13);
        dik.cevreHesapla();
        dik.alanHesapla();
        System.out.println(dik);

        System.out.println("---------------------------");

        Ücgen ücgen = new Ücgen(7, 4, 3);
        ücgen.cevreHesaplaÜcgen();
        System.out.println(ücgen);

        System.out.println("---------------------------");


        Kare kare = new Kare(12);
        kare.cevreHesaplaKare();
        kare.alanHesaplaKare();
        System.out.println(kare);

        System.out.println("---------------------------");


        Cember cember = new Cember(8);
        cember.cevreHesaplaCember();
        cember.alanHesaplaCember();
        System.out.println(cember);

    }


}
