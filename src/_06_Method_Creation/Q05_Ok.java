package _06_Method_Creation;

import java.util.Scanner;

public class Q05_Ok {

    public static void main(String[] args) {
         /*
        TASK :
       Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String input = scan.nextLine();

        kelimeSayisi(input);


    }

    private static void kelimeSayisi(String input) {

        int kelimeSayaci = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                kelimeSayaci++;
            }
        }
        System.out.println("Kelime sayisi : " + kelimeSayaci);


    }
}
