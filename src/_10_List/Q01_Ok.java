package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_Ok {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        List<String> aOlmayanIsimler = new ArrayList<String>();  //a olmayan isimlerin atanacagi bos list create edildi

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) { // a bulundurmayan isimler sarti
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler : " + aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);


    }
}
