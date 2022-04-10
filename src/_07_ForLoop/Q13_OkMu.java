package _07_ForLoop;

import java.util.Scanner;

public class Q13_OkMu {


    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle ve harf giriniz");

        String cümle = scan.nextLine();
        String harf = scan.next();
        int sayac = 0;

        for (int i = 1; i < cümle.length() ; i++) {
            if (cümle.substring(i, i + 1).equals(harf)) {
                sayac++;
            }

        }
        System.out.println(harf + " harfi " + sayac + " defa tekrar etmistir");


    }
}
