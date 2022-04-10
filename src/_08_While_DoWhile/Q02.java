package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();

        for (int i = 0; i <= input.length(); i++) {

            for (int j = 0; j <= i; j++) {
                if (input.indexOf(i) == i * (i + 1) / 2)

                    System.out.println((input.charAt(i) + " "));
            }

        }
    }

}


// System.out.println("Indexi tek sayi olan karakterler : " + input.charAt(input.indexOf(i)));

