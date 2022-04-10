package _07_ForLoop;

import java.util.Scanner;

public class Q07_2 {
    public static void main(String[] args) {
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

        Scanner scan = new Scanner(System.in);
        System.out.print("Matris boyutu giriniz : ");
        int boyut = scan.nextInt();

        int [][] dizi = new int[boyut][boyut];

        for (int i = 0; i < boyut ; i++) {   //i degeri satir icin dönecek
            for (int j = 0; j < boyut ; j++) { //j degeri sütun icin dönecek
                dizi[i][j] = 0;

                if (i==j){
                    dizi[i][j] = 1;
                }
                System.out.print(dizi[i][j] + " ");
            }
            System.out.println("");
        }




















    }
}
