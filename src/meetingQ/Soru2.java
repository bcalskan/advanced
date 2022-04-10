package meetingQ;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        /*
  Kullanici dan yas bilgisini alarak

   oy kullanma yasi :
   age >= 18  ==> oy kullanmaya uygun
   age >= 70  ==> uc kez oy kullanabilir
   70 > age >=50 ==> iki kez oy kullanabilir
   50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >= 18) {
            System.out.println("oy kullanmaya uygun");

            if (yas >= 70) {
                System.out.println("3 kez oy kullanabilir");
            } else if (yas >= 58) {
                System.out.println("2 kez oy kullanabilir");
            } else {
                System.out.println("1 kez oy kullanabilir");
            }


        } else if (yas >= 0 && yas < 18) {
            System.out.println("Oy kullanamazsin");
        } else {
            System.out.println("Hatali giris");
        }


    }
}
