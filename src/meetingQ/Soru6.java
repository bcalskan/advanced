package meetingQ;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir harf girmesini isteyiniz.
         Girilen harf sesli ise Sesli harf olduğunu,
         değilse sessiz harf olduğunu ekrana yazdırsın.
         Girdiği değer harf değilse yada
         1 karakterden fazla ise hata mesajı göstersin.
         (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

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
 we  yada  %
 Beklenen Çıktı:
 Yanlis karakter girdiniz!
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String input = scan.nextLine();
        String sesli = "aeiou";

        for (int i = 0; i < sesli.length(); i++) {
            if(input.length()>1){
                System.out.println("Lütfen bir harf giriniz");
                break;
            }
            if (sesli.contains(input.substring(0, 1))) {
                System.out.println("sesli harf");
                break;
            } else {
                System.out.println("sessiz harf ");
            }
        }


        //if (input > 'a' && input <= 'z') {
        //System.out.println("Girdiginiz deger bir harf degildir ya da bir karakterden daha fazladir");
        // }

        // switch (input) {

        // case 'a':
        // case 'e':
        // case 'i':
        //  case 'o':
        // case 'u':
        //System.out.println("Girilen harf sesli harftir");
        // break;
        //default:
        //  System.out.println("Girilen harf sessiz harftir");

    }


}



