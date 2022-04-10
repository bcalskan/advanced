package _05_StringManipulation;

import java.util.Scanner;

public class Q02_Ok {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String adSoyad = scan.nextLine();

        char space = ' ';
        int bosluk = adSoyad.indexOf(space);
        //adSoyad.substring(0,' ');

        String ad = adSoyad.substring(0, bosluk );
        String soyIsim = adSoyad.substring(bosluk+1);

        System.out.println("Isminiz : " +ad);
        System.out.println("Soyisiminiz : " +soyIsim);


    }
}
