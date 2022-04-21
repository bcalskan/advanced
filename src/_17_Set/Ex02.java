package _17_Set;

import java.util.*;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
     */
    static Random rnd = new Random();
    static int ortakEleman = 0;
    static int ortakOlmayanEleman = 0;


    public static void main(String[] args) {
        List<Integer> onElemanli = new ArrayList<>();
        List<Integer> besElemanli = new ArrayList<>();
        int on = 10;
        int bes = 5;

        System.out.println("On elemanli liste : " + onElemanliMethod(on, onElemanli));
        System.out.println("Bes elemanli liste : " + besElemanliMethod(bes, besElemanli));

        ortakElemanMethod(onElemanli, besElemanli);
        //ortakOlmayanElemanMethod(onElemanli,besElemanli);
        eklemeMethodu(onElemanli, besElemanli);
    }

    private static void eklemeMethodu(List<Integer> onElemanli, List<Integer> besElemanli) {
        List<Integer> eklenmisList = new ArrayList<Integer>();

        eklenmisList.addAll(onElemanli);
        eklenmisList.addAll(besElemanli);
        System.out.println("Eklenmis liste : " + eklenmisList);

        List<Integer> kücüktenBüyüge = new ArrayList<>();
        kücüktenBüyüge.addAll(eklenmisList);

        Collections.sort(kücüktenBüyüge);
        System.out.println("Kücükten büyüge : " + kücüktenBüyüge);

        Collections.reverse(kücüktenBüyüge);
        System.out.println("Ters : " + kücüktenBüyüge);
    }


    private static void ortakElemanMethod(List<Integer> onElemanli, List<Integer> besElemanli) {
        List<Integer> ortak = new ArrayList<Integer>();

        for (int i = 0; i < besElemanli.size(); i++) {
            for (int j = 0; j < onElemanli.size(); j++) {
                if (besElemanli.get(i) == onElemanli.get(j)) {
                    ortakEleman++;
                    ortak.add(besElemanli.get(i));
                }
            }
        }
        System.out.println("Ortak eleman sayisi : " + ortakEleman);
        System.out.println(ortak);
    }



    private static List<Integer> besElemanliMethod(int bes, List<Integer> besElemanli) {
        for (int i = 0; i < bes; i++) {
            int eleman = rnd.nextInt(20);
            besElemanli.add(eleman);
        }
        return besElemanli;
    }




    private static List<Integer> onElemanliMethod(int on, List<Integer> onElemanli) {
        for (int i = 0; i < on; i++) {
            int eleman = rnd.nextInt(20);
            onElemanli.add(eleman);
        }
        return onElemanli;
    }


//    private static void ortakOlmayanElemanMethod(List<Integer> onElemanli, List<Integer> besElemanli) {
//        List<Integer> ortakOlmayan = new ArrayList<Integer>();
//
//        for (int i = 0; i < besElemanli.size(); i++) {
//            for (int j = 0; j < onElemanli.size(); j++) {
//                if (besElemanli.get(i) != onElemanli.get(j)) {
//                    ortakOlmayanEleman++;
//                    ortakOlmayan.add(besElemanli.get(i));
//                    ortakOlmayan.add(onElemanli.get(j));
//                }
//            }
//        }
//        System.out.println("Ortak ortak olmayan eleman sayisi : " + ortakOlmayanEleman);
//        System.out.println(ortakOlmayan);
//    }
}
