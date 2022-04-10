package _05_StringManipulation;

import java.util.Scanner;

public class Q06_Ok {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz");
        String mail = scan.next();

        if (mail.contains("hotmail")) {
            System.out.println(mail.replace("hotmail", "gmail"));
        }

    }
}
