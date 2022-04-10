package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kacinci ay oldugunu giriniz");
        int sayi = scanner.nextInt();

        switch (sayi) {

            case 1:
                System.out.println("Ocak, 31 gün");
            case 3:
                System.out.println("Mart, 31 gün");
            case 5:
                System.out.println("Mayis, 31 gün");
            case 7:
                System.out.println("Temmuz, 31 gün");
            case 8:
                System.out.println("Agustos, 31 gün");
            case 10:
                System.out.println("Ekim, 31 gün");
            case 12:
                System.out.println("Aralik, 31 gün");
                break;

            case 4:
                System.out.println("Nisan, 31 gün");
            case 6:
                System.out.println("Haziran, 31 gün");
            case 9:
                System.out.println("Eylül, 31 gün");
            case 11:
                System.out.println("Kasim, 31 gün");
                break;

            case 2:
                System.out.println("Lütfen bulundugunuz yili giriniz");
                int yil = scanner.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("girdiğiniz ayda 29 gün vardır");

                } else {
                    System.out.println("girdiğiniz ayda 28 gün vardır");
                }
                break;

            default:
                System.out.println("Hatali giris");


        }


    }
}

