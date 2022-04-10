package _08_While_DoWhile;

import java.util.Scanner;

public class Q03_TekrarEt {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27
        2  3 = 2*2*2=8
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        double sonuc = 1;

        while (input2 != 0){
            sonuc *= input1;
            --input2;
        }
        System.out.println("CEVAP = " + sonuc);
    }
}
