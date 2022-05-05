package Projects.Projects_03;

import java.util.Scanner;

public class SubtractionSquare {
    /*
   substSquare: bu method parametre olara iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.

  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250

   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

  parametreleri kullanıcıdan alınız
    */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Sayi 1 : ");
        int sayi1 = scan.nextInt();

        System.out.println("Sayi 2 : ");
        int sayi2 = scan.nextInt();

        int sonuc = substSquare(sayi1, sayi2);
        System.out.println(sonuc);

    }

    private static int substSquare(int sayi1, int sayi2) {
        return getSumOfSquares(sayi1) + getSumOfSquares(sayi2);
    }

    private static int getSumOfSquares(int n) {
        int toplam1 = 0;

        for (int i = 0; i <= n; i++) {
            toplam1 += i;
        }
        return toplam1*toplam1;
    }


}
