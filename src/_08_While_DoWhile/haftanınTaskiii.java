package _08_While_DoWhile;

import java.util.Scanner;

public class haftanınTaskiii {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Istediginiz yüksekligi metre olarak giriniz : ");
        double yükseklik = scan.nextDouble();

        int ziplamaSayisi = 0;
        double toplamYol = 0;

        do {
            toplamYol += yükseklik; //ilk birakildigi mesafe toplam yola eklendi
            ziplamaSayisi++;
            yükseklik *= 0.75;
            toplamYol += yükseklik;

        } while (yükseklik >= 1);

        System.out.println("Aldigi yol " + toplamYol + " metredir");
        System.out.println("Top  " + ziplamaSayisi + " defa ziplamistir");


    }
}



