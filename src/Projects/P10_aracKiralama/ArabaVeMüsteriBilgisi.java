package Projects.P10_aracKiralama;

import java.util.Scanner;

public class ArabaVeMüsteriBilgisi {
    static Scanner scan = new Scanner(System.in);
    static int kiralanacakGünSayisi;


    public static void aracTalepEt() {
        System.out.println("Araci teslim almak istediginiz sehri giriniz : ");
        String sehir = scan.nextLine();
        System.out.println("Araci teslim almak istediginiz günü giriniz : (Örnek: 16.04)");
        String alisGünü = scan.next();
        System.out.println("Araci teslim almak istediginiz saati giriniz : (Örnek: 10.43)");
        String alisSaati = scan.next();
        System.out.println("Araci teslim etmek istediginiz günü giriniz : (Örnek: 20.04) ");
        String teslimGünü = scan.next();
        System.out.println("Araci teslim etmek istediginiz saati giriniz : (Örnek: 12.45) ");
        String teslimSaati = scan.next();

        System.out.println("*****************************************************");

        String aGünü = alisGünü.substring(0, 2);
        int intAlisGünü = Integer.parseInt(aGünü);

        String aAyi = alisGünü.substring(3);
        int intAlisAyi = Integer.parseInt(aAyi);
        System.out.println("Arabayi teslim alacaginiz tarih : " + intAlisGünü + "." + intAlisAyi);

        System.out.println("*****************************************************");

        String tGünü = teslimGünü.substring(0, 2);
        int intTeslimGünü = Integer.parseInt(tGünü);

        String tAyi = alisGünü.substring(3);
        int intTeslimAyi = Integer.parseInt(tAyi);
        System.out.println("Arabayi teslim edeceginiz tarih : " + intTeslimGünü + "." + intTeslimAyi);

        System.out.println("*****************************************************");

        if (intTeslimAyi < intAlisAyi) {
            System.out.println("Teslim ayi alis ayindan önce olamaz.");
            aracTalepEt();
        } else if (intTeslimGünü < intAlisGünü) {
            System.out.println("Teslim gübü teslim ayindan önce olamaz");
            aracTalepEt();
        } else {
            System.out.println("Hatali giris yaptiniz.");
            aracTalepEt();
        }


        kiralanacakGünSayisi = (intTeslimAyi - intAlisAyi) * 30 + (intTeslimGünü - intAlisGünü);
        System.out.println("Sectiginiz araci kiraladiginiz gün sayisi : " + kiralanacakGünSayisi);


    }

    public static void islemeDevamEtmeDöngüsü() {
        System.out.println("Isleme devam etmek istiyorsaniz E´ye basiniz\nIsleme devam etmek istemiyorsaniz H´ye basiniz.");
        String devamEt = scan.next();

        if (devamEt.equalsIgnoreCase("E")) {
            //müsteriBilgisi();
        } else if (devamEt.equalsIgnoreCase("H")) {
            //arabaÖzellikleri();
        }
    }

}
