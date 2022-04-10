package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Ok {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        Scanner scan = new Scanner(System.in);

        char devam = 'E';

        double ortalama =0;
        int gecenler = 0;

       List <Double> notlar = new ArrayList<>();

       do{
            System.out.println("Not giriniz");
            double not = scan.nextDouble();
            notlar.add(not);
            ortalama += not;

            System.out.println("Devam etmek icin E \nDurmak H");
            devam = scan.next().toUpperCase().charAt(0);

        }while(devam != 'H');
        ortalama /= notlar.size();

        for(double not : notlar){
            if(not > ortalama) gecenler++;
        }

        System.out.println("Ortalama : " +ortalama);
        System.out.println("Gecen ogrenci sayisi:" + gecenler);


    }
}
