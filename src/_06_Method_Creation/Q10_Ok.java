package _06_Method_Creation;

import java.util.Scanner;

public class Q10_Ok {
    public static void main(String[] args) {
        /*TASK : powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int input = scan.nextInt();

        powerOfThree(input);

    }

    private static boolean powerOfThree(int input) {

        boolean ücKuvveti = true;

        System.out.println((input % 3 == 0) ? ücKuvveti : !ücKuvveti);

        return ücKuvveti;
    }


}
