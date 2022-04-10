package meeting;

import java.util.Scanner;

public class Q12_ThreeEvenOdd {
    public static void main(String[] args) {

        /*
        Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.
   Örnek:
   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");
        int elemanSayisi = scan.nextInt();

        int arr[] = new int[elemanSayisi];

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(i + 1 + ". elemani giriniz");
            int elemanlar = scan.nextInt();
            arr[i] = elemanlar;
        }

        int sayacCift = 0;
        int sayacTek = 0;
        boolean ücTaneMi = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sayacCift++;
            } else sayacTek++;

        }

        System.out.println("Cift sayi adedi : " + sayacCift);
        System.out.println("Tek sayi adedi : " + sayacTek);

        if (sayacCift >= 3 || sayacTek >= 3) {
            System.out.println(ücTaneMi);
        } else System.out.println(!ücTaneMi);


    }
}
