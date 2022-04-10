package Projects.Projects_01_Ok;

import java.util.Scanner;

public class perfectSquare_Ok {
    /*
    Pozitif bir int  num verildiğinde, return edildiği zaman num tamkare ise true veren değilse false veren bir foksiyon yazın.

 Not: sqrt gibi fonksiyonları  kullanmayın.

        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25

        Example 3:
        Input: 14
        Output: false
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz : ");
        int input = scanner.nextInt();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

        boolean tamKareMi = true;
        for (int i = 1; i < input / 2 + 1; i++) {
            if (i * i == input) {
                System.out.println(tamKareMi);
                System.out.println(i + "*" + i + " = " + input);
            } else {
                System.out.println(input + " sayisi tam kare degildir.");
                System.out.println(!tamKareMi);
                break;
            }
        }
    }

}
