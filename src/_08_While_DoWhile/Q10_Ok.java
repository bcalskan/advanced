package _08_While_DoWhile;

import java.util.Scanner;

public class Q10_Ok {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int input = 0;

        int max = 0;

        while (sayac < 5) {
            System.out.println("Bir sayi giriniz");
            input = scan.nextInt();
            sayac++;

            if (input > max)
                max = input;
        }
        System.out.println("En büyük : " +max);
    }
}


