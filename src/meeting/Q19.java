package meeting;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int ters = 0;
        int kalan = 0;

        while (sayi != 0) {
            kalan = sayi % 10;
            ters = ters * 10 + kalan;
            sayi /= 10;
        }

        System.out.println(ters);


    }
}
