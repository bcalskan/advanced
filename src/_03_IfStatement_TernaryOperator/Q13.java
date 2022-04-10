package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ücgenin kenar uzunluklarini giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Birinci kenar : " +a);
        System.out.println("Ikinci kenar : " +b);
        System.out.println("Ücüncü kenar : " +c);

        if ((a*a)+(b*b) == c*c){
            System.out.println("Bu bir dik ücgendir");
        }else{
            System.out.println("Bu dik ücgen degildir");
        }


    }
}
