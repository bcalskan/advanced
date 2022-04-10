package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        //C(n,r) = n! / (r!(n-r)!)

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int a = input1 - input2;

        int sayac = input1;
        int sayac2 = input2;
        int sayac3 = a;

        int faktoriyel1 = 1;
        int faktoriyel2 = 1;
        int faktoriyel3 = 1;

        while (sayac > 1) {
            faktoriyel1 *= sayac;
            sayac--;
        }

        while (sayac2 > 1) {
            faktoriyel2 *= sayac2;
            sayac2--;
        }

        while (sayac3 > 1) {
            faktoriyel3 *= sayac3;
            sayac3--;
        }

        System.out.println(faktoriyel1 / (faktoriyel2 * faktoriyel3));


    }
}


