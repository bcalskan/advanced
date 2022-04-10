package _08_While_DoWhile;

import java.util.Scanner;

public class Q13_SOR {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz ürün adedini giriniz");
        int adet = scan.nextInt();

        System.out.println("Aldiginiz ürünün liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();

        System.out.println("Müsteri kartiniz varsa 1´e \nMüsteri kartiniz yoksa 2´ye basiniz");
        int kartSorusu = scan.nextInt();


        while (kartSorusu == 1) {
            if (adet > 10) {
                double tutar = (adet * listeFiyati) - (adet * listeFiyati * 20 / 100);
                System.out.println("Ödemeniz gereken tutar : " + tutar);
            } else {
                double tutar = (adet * listeFiyati) - (adet * listeFiyati * 15 / 100);
                System.out.println("Ödemeniz gereken tutar : " + tutar);
            }
            break;
        }


        while (kartSorusu == 2) {

            if (adet > 10) {
                double tutar = (adet * listeFiyati) - (adet * listeFiyati * 15 / 100);
                System.out.println("Ödemeniz gereken tutar : " + tutar);
            } else {
                double tutar = (adet * listeFiyati) - (adet * listeFiyati * 10 / 100);
                System.out.println("Ödemeniz gereken tutar : " + tutar);
            }
            break;
        }




    }
}


