package _05_StringManipulation;

import java.util.Scanner;

public class Q01_Ok {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("String type bir veri giriniz");
        String input = scan.nextLine();

        if (input.contains(" ")){
            System.out.println("Girdiginiz input bosluk iceriyor");
        }else{
            System.out.println("Girdiginiz input bosluk icermiyor");
        }


    }
}

