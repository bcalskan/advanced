package _07_ForLoop;

import java.util.Scanner;

public class Q03_Ok {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine().toLowerCase();

        int sayac = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                sayac++;
            } else if (input.charAt(i) == 'c') {
                break;
            }

        }
        System.out.println("A harfi sayisi : " +sayac
        );

    }
}
