package _07_ForLoop;

import java.util.Scanner;

public class Q06_Ok {

    public static void main(String[] args) {
         /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyut sayisi giriniz");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= input; j++) {
                System.out.print(i * j + " ");

            }
            System.out.println("");


        }

    }

}
