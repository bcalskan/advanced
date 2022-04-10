package _08_While_DoWhile;

import java.util.Scanner;

public class Q07_Ok {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
       */

        Scanner scan = new Scanner(System.in);
        char input = ' ';

        while (input != 'x') {
            System.out.println("Bir harf giriniz");
            input = scan.next().charAt(0);
            if (input != 'x')
                System.out.println("Program calisiyor");
        }

        System.out.println("Program bitti");


    }
}
