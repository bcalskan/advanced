package _08_While_DoWhile;

import java.util.Scanner;

public class Q12_SOR {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız. girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int input = scan.nextInt();

        int i = 1;
        while (i <= input) {
            System.out.println(i + " ");
            i += 2;
        }


    }
}
