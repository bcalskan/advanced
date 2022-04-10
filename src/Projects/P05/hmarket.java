package Projects.P05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hmarket {

    private static ArrayList<String> urunSec(List<String> ürünIsmi, int ürünNumarasi) {
        ArrayList<String> sepet = new ArrayList<String>();
        ürünIsmi.get(ürünNumarasi);
        sepet.add(ürünIsmi.get(ürünNumarasi));
        return sepet;
    }

    private static double fiyat(List<Double> ücret, int ürünNumarasi) {
        double totalPrice = 0;
        totalPrice += ücret.get(ürünNumarasi);
        return totalPrice;
    }

    private static void odeme(double toplamFiyat, double ödenenPara) {
        double paraUstu = 0;

        System.out.println(Math.round(ödenenPara - toplamFiyat) + " dolar para ustunuz almayi unutmayiniz ");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("   **** Marketimize Hos Geldiniz ****   ");

        List<String> ürünIsmi = List.of("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon");

        List<Double> ücret = List.of(2.10, 3.20, 1.5, 2.5, 3.10, 1.20, 1.90, 6.30, 4.10, 0.50);

        System.out.println("Almak istediginiz urunlerin kodunu giriniz.");

        double currentPrice = 0;
        double toplamFiyat = 0;

        ArrayList<String> sepet = new ArrayList<>();

        while (true) {

            int ürünNumarasi = scan.nextInt();

            urunSec(ürünIsmi, ürünNumarasi);

            fiyat(ücret, ürünNumarasi);

            System.out.println(urunSec(ürünIsmi, ürünNumarasi) + " ürünü sepetinize eklendi ve kilosu " + ücret.get(ürünNumarasi) + "$");
            System.out.println("Kac kilo almak istiyorsunuz");
            int kg = scan.nextInt();

            sepet.addAll(urunSec(ürünIsmi, ürünNumarasi));

            currentPrice = fiyat(ücret, ürünNumarasi) * kg;
            toplamFiyat += currentPrice;

            System.out.println(kg + " kilo " + urunSec(ürünIsmi, ürünNumarasi) + " aldiniz. \nOdenecek tutar= " + currentPrice + " $ ");
            System.out.println("sepete ekleme yapacak misiniz? \nEvet ise E \nHayir ise H ");
            String secim = scan.next().toUpperCase();
            if (secim.equals("E")) {
                System.out.println("Lutfen almak istediginiz urunu giriniz ");
                continue;
            } else {
                System.out.println("aldiginiz urunler " + sepet + "mevcut odenecek tuttariniz= " + toplamFiyat + "\n================ Lutfen odeme icin sepete geciniz ");
                break;
            }
        }
        System.out.println("odeme tutarinizi giriniz");
        double ödenenPara = scan.nextInt();
        odeme(toplamFiyat, ödenenPara);

    }
}
