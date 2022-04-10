package _06_Method_Creation;

import java.util.Scanner;

public class Q07_Ok {
    public static void main(String[] args) {

 /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();

        reverseString(input);


    }

    private static void reverseString(String input) {

        String ters = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            ters += input.charAt(i);
        }
        System.out.println("Tersten : " + ters);


    }


}
