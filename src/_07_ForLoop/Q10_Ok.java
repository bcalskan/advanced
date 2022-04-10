package _07_ForLoop;

import java.util.Scanner;

public class Q10_Ok {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");


        for (char i = 'a'; i <= 'z'; i++) {
            char input = scan.next().toLowerCase().charAt(0);
            if (!(input > 'a' && input <= 'z')) {
                System.out.println("Lütfen harf giriniz");
                break;
            }
            switch (input) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Girdiginiz harf sesli harftir");
                    break;
                default:
                    System.out.println("Sessiz harf girdiniz");


            }

        }

    }

}


