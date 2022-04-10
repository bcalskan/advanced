package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz boyutu giriniz");
        int boyut = scan.nextInt();

        for (int i = 0; i <=boyut ; i++) {
            for (int j = 0; j < i ; j++) {

                System.out.print("*");

            }
            System.out.println("");

        }








    }
}
