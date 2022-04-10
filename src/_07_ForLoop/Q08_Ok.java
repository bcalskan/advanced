package _07_ForLoop;

import java.util.Scanner;

public class Q08_Ok {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();

        String ters = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            ters += input.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin ters hali : " + ters);

        if (input.equalsIgnoreCase(ters)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }

    }

}

