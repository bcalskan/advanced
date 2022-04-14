package yeniSorular;


import java.util.Arrays;
import java.util.Scanner;


public class Array2_Ok {
    public static void main(String[] args) {
        /*
        Verilen bir sayının, bir dizide kaç defa tekrarlandığını
        bulan Java programını oluşturun.
         */


        int arr[] = {1, 3, 5, 3, 8, 7, 5, 6, 3, 4, 7, 15, 3, 15, 48, 3};
        System.out.println(Arrays.toString(arr));

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac defa tekrar edildigini bulmak istediginiz sayiyi giriniz : ");
        int arananSayi = scan.nextInt();

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;
            }
        }

        System.out.println("Aradiginiz " + arananSayi + " sayisi dizi icerisinde " + sayac + " defa tekrar edilmistir.");

    }
}
