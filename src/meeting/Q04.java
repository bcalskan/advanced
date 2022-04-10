package meeting;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    static Scanner scan = new Scanner(System.in);
    static List<String> kullaniciListesi = new ArrayList<String>();
    static List<String> sansliKullanicilar = new ArrayList<String>();

    public static void main(String[] args) {
        /*
        Haftanın Taski : Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
        ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
        şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
         */

        while (true) {

            kullaniciListesi = kayitOl();
            System.out.println("Kullanici Listesi : " + kullaniciListesi);

            System.out.println("Sansli kullanici Listesi : " + sansliKullanicilar);
        }
    }

    public static ArrayList kayitOl() {

        System.out.print("Kullanici isminizi giriniz : ");

        Q04_User obj = new Q04_User();

        obj.name = scan.nextLine();
        obj.kayitTarihi = LocalDateTime.now();
        obj.kayitSaniyesi = obj.kayitTarihi.getSecond();

        sansliKisiEkle(obj.kayitSaniyesi, obj.name);

        kullaniciListesi.add(obj.name);

        return (ArrayList) kullaniciListesi;
    }

    public static void sansliKisiEkle(int kayitSaniyesi, String name) {

        if (kayitSaniyesi <= 10) {
            sansliKullanicilar.add(name);
        }
    }


}
