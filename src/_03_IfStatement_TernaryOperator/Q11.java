package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen tarihi gün ay yil olarak giriniz");
        int gün = scan.nextInt();
        int ay  = scan.nextInt();
        int yil = scan.nextInt();

        System.out.println("Gün-ay-yil olarak : " +gün+ "." +ay+ "." +yil);
        System.out.println("Ay-gün-yil olarak : " +ay+ "." +gün+ "." +yil);
        System.out.println("Yil-ay-gün olarak : " +yil+ "." +ay+ "." +gün);






    }
}
