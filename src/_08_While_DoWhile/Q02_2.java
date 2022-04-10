package _08_While_DoWhile;

import java.util.Scanner;

public class Q02_2 {
    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");

        String input = scan.nextLine();

        int i = 1;
        while (i < input.length() - 1) {
            System.out.print(input.charAt(i) + ",");
            i += 2;
        }


    }


}





