package projeDenemeleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisiler> ögrenciListesi = new ArrayList<>();
    static List<Kisiler> ögretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTürü;


    public static void giris() {
        System.out.println("====================================");
        System.out.println("ÖGRENCI VE ÖGRETMEN YÖNETIM PANELI");
        System.out.println("====================================");

        System.out.println("   1-ÖGRENCI ISLEMLERI   " + "\n   2-ÖGRETMEN ISLEMLERI   " + "\n   Q-CIKIS   ");

        System.out.print("Yapmak istediginiz islemi seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTürü = "ÖGRENCI";
                islemMenüsü();
                break;
            case "2":
                kisiTürü = "ÖGRETMEN";
                islemMenüsü();
                break;
            case "Q":
                cikisMenüsü();
                break;
            default:
                System.out.println("Hatali giris yapildi.");
                giris(); //recursive method call
                break;

        }

    }


    private static void islemMenüsü() {
        System.out.println("Sectiginiz " + kisiTürü + "icin asagidaki islemlerden tercih yapiniz. ");
        System.out.println("============= İŞLEMLER =============" + "\n   1-EKLEME   \n   2-ARAMA   \n   3-LISTELEME " +
                "  \n   4-SILME   \n   5-ANA MENÜ   ");
        int islemSec = scan.nextInt();

        switch (islemSec) {
            case 1:
                ekleme();
                islemMenüsü();
                break;
            case 2:
                islemMenüsü();
                break;
            case 3:
                islemMenüsü();
                break;
            case 4:
                islemMenüsü();
                break;
            case 0:
                islemMenüsü();
                break;
            default:
                System.out.println("adam bir şey girrr :( ");
                islemMenüsü();
                break;
        }


    }

    private static void cikisMenüsü() {
        System.out.println("Cikis yapildi. Ziyaretiniz icin tesekkür ederiz!");
    }

    private static void ekleme() {
        System.out.println("   ***   " + kisiTürü + " ekleme sayfası   ***");
        System.out.print("Eklemek istediginiz kisinin adini soyadini giriniz : ");
        String adSoyad = scan.nextLine();

        System.out.print("Eklemek istediginiz kisinin kimlik numarasini giriniz : ");
        String kimlikNumarasi =scan.nextLine();

        System.out.print("Eklemek istediginiz kisinin yasini giriniz : ");

        if (kisiTürü.equals("ÖGRENCI")){

            System.out.print("Ögrencu numarasi giriniz : ");
            String ögrenciNumarasi =scan.next();
            System.out.print("Sinif giriniz : ");
            String sinif = scan.next();

          //  Ögrenci ögrenciObj = new Ögrenci(adSoyad,kimlikNumarasi,yas,ögrenciNumarasi,sinif);


        }




    }


}
