package _17_Set;

import java.util.HashSet;

public class Ex07_Ok {

    /*  TASK :
     * main method altinda bir double hashSet olusturunuz.
     *
     * ve bu seti, adi setOlustur ve return tipi hashSet double olan
     *
     * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
     * kullanarak doldurun.
     *
     * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
     * edecek ayri bir method olusturarak
     *
     * hashSetin degerlerinin toplamini alacaksiniz.
     */
    static HashSet<Double> hashList = new HashSet<Double>();
    static HashSet<Double> toplamList = new HashSet<Double>();


    public static void main(String[] args) {

        eklemeMethodu(hashList);
        System.out.println("Toplam list : " + toplaminiAl(toplamList));

    }

    private static HashSet<Double> toplaminiAl(HashSet<Double> toplamList) {
        double toplam = 0;
        for (Double each : hashList) {
            toplam += each;
        }
        toplamList.add(toplam);

        return toplamList;
    }

    private static HashSet<Double> eklemeMethodu(HashSet<Double> hashList) {
        hashList.add(3.23);
        hashList.add(3.10);
        hashList.add(5.12);
        hashList.add(10.12);
        hashList.add(23.12);

        return hashList;
    }


}
