package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi ve kilonuzu giriniz");
        double yas = scan.nextDouble();
        double kilo = scan.nextDouble();

        if (yas > 0 && yas < 18) {
            System.out.println("Kan bagisi yapamazsiniz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("Yasiniz kan bagisi icin uygun ancak kilonuz yetersiz");
            } else if (kilo >= 50) {
                System.out.println("Kan bagisi yapabilirsiniz");
            } else {
                System.out.println("Kilonuzu hatali girdiniz");
            }

        } else {
            System.out.println("Hatali veri girdiniz");
        }


    }

}
