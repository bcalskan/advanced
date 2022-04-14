package yeniSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array3_Ok {
    public static void main(String[] args) {
        /*
         Pasta yapımı için marketten malzemeler alınacak.
         Bu malzemeleri klavyeden diziye atayacağız.
         Daha sonra atadığımız malzemelerden birini silen programı
         yazacağız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Pasta yapimi icin kac malzemeye ihtiyaciniz oldugunu giriniz : ");
        int malzemeSayisi = scan.nextInt();
        String pastaMalzemeleri[] = new String[malzemeSayisi];

        for (int i = 0; i < malzemeSayisi; i++) {
            System.out.println(i + 1 + ". malzemeyi giriniz : ");
            String malzemeler = scan.next();
            pastaMalzemeleri[i] = malzemeler;
        }
        System.out.println("Istediginiz malzemeler : " + Arrays.toString(pastaMalzemeleri));

        List<String> pastaMalzemeListesi = new ArrayList<String>(Arrays.asList(pastaMalzemeleri));

        System.out.print("Silmek istediginiz bir malzeme varsa giriniz : ");
        String silinecekMalzeme = scan.next();

        for (int i = 0; i < pastaMalzemeListesi.size(); i++) {
            if (pastaMalzemeListesi.get(i).equalsIgnoreCase(silinecekMalzeme)) {
                pastaMalzemeListesi.remove(i);
            }
        }
        System.out.println("Malzeme siliniyor...");
        System.out.println("***************************");
        System.out.println("Listenizin son hali : " + pastaMalzemeListesi);


    }
}
