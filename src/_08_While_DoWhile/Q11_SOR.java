package _08_While_DoWhile;

import java.util.Scanner;

public class Q11_SOR {
    public static void main(String[] args) {
        /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 3:
            Input: 14
            Output: false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int input = scan.nextInt();
        int t = 0;

        for (int i = 1; i <= input / 2 + 1; i++) {  //   input/2+1 kere dönen döngünün olusturulur
            //kosul kontrol edilir
            if (input == i * i) {
                t = 1;
                break;
            }
        }
        // Koşulun sağlanıp sağlanmadığını kontrol etmek için “t”yi kullandık, çünkü koşul sağlandığında “t” değişecek
        if (t!= 0){
            System.out.println("Tam karedir");
        }else{
            System.out.println("Tam kare degildir");
        }
    }
}
