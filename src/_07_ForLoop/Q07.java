package _07_ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {


     /*  TASK :
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1

            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1
       */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matris boyutu giriniz");
        int boyut = scan.nextInt();

        int[][] dizi = new int[boyut][boyut];         //çok boyutlu dizi tanımlama
        int i, j;


        for (i = 0; i < boyut; i++) {                //i değeri satır için dönecek
            for (j = 0; j < boyut; j++) {            //j değer sutun için dönecek
                dizi[i][j] = 0;

                if (i == j) {                        //eğeri indexler eşit olunca bir yapacak
                    dizi[i][j] = 1;
                }
            }
        }

        for (i = 0; i < boyut; i++) {
            for (j = 0; j < boyut; j++) {
                System.out.print(dizi[i][j] + " ");  //birim matrisi yazdırma   \t = " ";
            }

            System.out.println("");
        }


    }
}




