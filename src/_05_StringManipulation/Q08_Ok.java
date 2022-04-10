package _05_StringManipulation;

import java.util.Scanner;

public class Q08_Ok {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String input = scan.nextLine();

        if (input.length()>=3){
            System.out.print(input.substring(input.length()-2));
            System.out.print(input.substring(input.length()-2));
            System.out.print(input.substring(input.length()-2));
        }else {
            System.out.println(input);
        }



    }
}
