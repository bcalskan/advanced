package Projects.Projects_01_Ok;

import java.util.Scanner;

public class totalLetterCountCheck_Ok {
    /*
     Bir String verildiğinde

     Eger String harf sayisi tek ise true print et değilse false print et
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line
        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        boolean tekMi = true;

        if (word.length() % 2 == 0) {
            System.out.println(tekMi);
        } else System.out.println(!tekMi);
    }
}
