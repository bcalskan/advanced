package _08_While_DoWhile;

import java.util.Scanner;

public class Q11_2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        int num = scan.nextInt();
        int i = 1;
        boolean tamKareMi = false;

        while (i <= num) {
            if (i * i == num) {
                System.out.println("Girdiginiz sayi tam kare dir cunku : " + i + "*" + i + "=" + (i * i));
                tamKareMi = true;
                break;
            } else {
                i++;
            }
        }
        System.out.println(tamKareMi);
    }
}

