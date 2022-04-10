package _08_While_DoWhile;

import java.util.Scanner;

public class Q16_Ok {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String sifre = "let me in";
        int deneme = 0;
        String input = "";


        while (!(input.equals(sifre))) {
            System.out.println("Lütfen sifrenizi giriniz");
            input = scan.nextLine().toLowerCase();
            deneme++;

            if (deneme == 3) {
                System.out.println("Toplam " + deneme + " deneme yaptiniz." + "\nDeneme hakkiniz bitti");
                break;
            }

            if (input.equals(sifre)) {
                System.out.println("****Sifreniz kabul edildi****");
            }
        }


    }
}
