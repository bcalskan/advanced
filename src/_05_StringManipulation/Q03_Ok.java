package _05_StringManipulation;

import java.util.Scanner;

public class Q03_Ok {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println(isim.charAt(0) + "." + isim.charAt(isim.indexOf(" ") + 1) +
                "." + isim.charAt(isim.lastIndexOf(" ") + 1) + ".");

    }
}
