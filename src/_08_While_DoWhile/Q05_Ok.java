package _08_While_DoWhile;

import java.util.Scanner;

public class Q05_Ok {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int toplam = 0;
        int rakam = 0;
        int rakamlarToplami = 0;

        while (input > 0) {

            rakam = input % 10;
            rakamlarToplami += rakam;
            input /= 10;
        }

        System.out.println(rakamlarToplami);


    }

}
