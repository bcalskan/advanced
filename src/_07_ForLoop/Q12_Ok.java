package _07_ForLoop;

import java.util.Scanner;

public class Q12_Ok {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("1´den büyük bir tam sayi giriniz");
        int input = scan.nextInt();
        int sum = 0;
        int karesi = 0;

        for (int i = 1; i <= input; i++) {
            karesi =i*i;
            sum = sum+karesi;

        }
        System.out.println("Girilen sayi : " + input);
        System.out.println("Kareler toplami : " + sum);

    }
}
