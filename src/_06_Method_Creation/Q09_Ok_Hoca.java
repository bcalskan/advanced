package _06_Method_Creation;

import java.util.Scanner;

public class Q09_Ok_Hoca {
/*
    TASK :
    addDigits isminde bir method create ediniz.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, return etsin
    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.              2 , tek basamaklı olduğundan, bunu döndürün.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("Girdginiz sayinin tek haneli rakamlar toplami : " +addDigits(sayi));
    }
    private static int addDigits(int sayi) {
        while (sayi >= 10) {

            sayi = rakamTopla(sayi);
        }
        return sayi;
    }
    private static int rakamTopla(int sayi) { //girilen sayinin rakamlar toplamini verir
        int rakam = 0;
        int toplam = 0;

        while (sayi > 0) {
            rakam = sayi % 10; //birler basamagini verir/rakama atar
            toplam += rakam;
            sayi /= 10; //sayinin birler basamagini sayidan ayirip kalan basamaklar elde edilir
        }
        return toplam;
    }

}
