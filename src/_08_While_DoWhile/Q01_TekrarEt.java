package _08_While_DoWhile;

import java.util.Scanner;

public class Q01_TekrarEt {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();

        int originalNumber = 0;
        int remainder = 0;
        int sum = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else System.out.println(number + " is not an Armstrong number.");
    }
}
