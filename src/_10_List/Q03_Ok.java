package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_Ok {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner scan = new Scanner(System.in);

        System.out.print("Kac elemanli bir liste olusturmak istiyorsunuz? : ");
        int elemanSayisi = scan.nextInt();

        List<Integer> liste = new ArrayList<Integer>();

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(i + 1 + ". elemani giriniz :");
            int elemanlar = scan.nextInt();

            liste.add(elemanlar);
        }
        System.out.println("Olusturdugunuz liste : " + liste);

        int sum = 0;
        for (int i = 0; i < liste.size(); i++) {
            sum += Math.pow(liste.get(i), 2);
        }
        System.out.println("Elemanlarin kareleri toplami : " + sum);

    }
}
