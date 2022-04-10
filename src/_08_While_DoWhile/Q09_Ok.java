package _08_While_DoWhile;

import java.util.Scanner;

public class Q09_Ok {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        int myPin = 123498765;

        System.out.println("Sifrenizi giriniz");
        int pin = scan.nextInt();

        while (pin != myPin) {
            System.out.println("Sifrenizi giriniz");
            pin = scan.nextInt();
        }
        System.out.println("Sifreniz dogru");


    }
}

