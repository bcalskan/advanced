package _05_StringManipulation;

import java.util.Scanner;

public class Q12_Ok {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz");
        String input = scan.nextLine();

        if (!(input.contains("@"))) {
            System.out.println("Gecerli bir email adresi giriniz.");
        } else if (input.endsWith("gmail.com")) {
            System.out.println("Email adresiniz onaylandi");
        } else if (!(input.endsWith("gmail.com"))) {
            System.out.println("Lutfen gmail hesabinizi girin");
        }
    }

}
