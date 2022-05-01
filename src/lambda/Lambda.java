package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
     */


    public static void main(String[] args) {
        Üniversite gazi = new Üniversite("Gazi", "Uluslararasi Iliskiler", 542, 78);
        Üniversite ankara = new Üniversite("ankara", "Siyasal", 1000, 83);
        Üniversite odtü = new Üniversite("ODTÜ", "Isletme", 379, 67);
        Üniversite bilkent = new Üniversite("Bilkent", "Matematik", 134, 91);
        Üniversite bozok = new Üniversite("Bozok", "Ilahiyat", 453, 98);

        List<Üniversite> uni = new ArrayList<>(Arrays.asList(gazi, ankara, odtü, bilkent, bozok));

        System.out.println(notOrtalamasiKontrol(uni));
        System.out.println("\n---------------------");


        System.out.println(ögrenciSayisiKontrol(uni));
        System.out.println("\n---------------------");

        System.out.println(bölümKontrol(uni));
        System.out.println("\n---------------------");

        büyüktenKücügeSirala(uni);
        System.out.println("\n---------------------");

        notOrtSirala(uni);
        System.out.println("\n---------------------");

        ögrenciSayisiAzIkinci(uni);
        System.out.println("\n---------------------");

        toplam1(uni);
        System.out.println("\n---------------------");

        notOrtalamasiOrtalamasi(uni);
        System.out.println("\n---------------------");

        matematikSayisi(uni);
        System.out.println("\n---------------------");

        enBüyükNotOrt(uni);
        System.out.println("\n---------------------");

        enKücükNotOrt(uni);
        System.out.println("\n---------------------");


    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrtalamasiKontrol(List<Üniversite> uni) {
        return uni.stream().allMatch(t -> t.getNotOrtalamasi() > 74);
        //AllMatch --> tüm elemanlar sarti saglarsa true, en az bir tane sarti saglamazsa false return eder
    }

    //task 02-->ogrc sayilarinin 110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean ögrenciSayisiKontrol(List<Üniversite> uni) {
        return uni.stream().allMatch(t -> t.getÖgrenciSayisi() > 110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean bölümKontrol(List<Üniversite> uni) {
        return uni.stream().anyMatch(t -> t.getBölüm().equalsIgnoreCase("Matematik"));
        //return uni.stream().anyMatch(t-> t.getBölüm().contains("Matematik"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void büyüktenKücügeSirala(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getÖgrenciSayisi).reversed()).collect(Collectors.toList()));
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void notOrtSirala(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getNotOrtalamasi).reversed()).limit(3).collect(Collectors.toList()));
    }

    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static void ögrenciSayisiAzIkinci(List<Üniversite> uni) {
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getÖgrenciSayisi)).skip(1).findFirst());
        System.out.println(uni.stream().sorted(Comparator.comparing(Üniversite::getÖgrenciSayisi)).limit(2).skip(1).collect(Collectors.toList()));
    }

    //task 07--> notOrt 63 'ten buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz
    public static void toplam1(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getNotOrtalamasi() > 63).mapToInt(t -> t.getÖgrenciSayisi()).sum());
        System.out.println(uni.stream().filter(t -> t.getNotOrtalamasi() > 63).map(t -> t.getÖgrenciSayisi()).reduce(Integer::sum));
        System.out.println(uni.stream().filter(t -> t.getNotOrtalamasi() > 63).map(t -> t.getÖgrenciSayisi()).reduce(Math::addExact)); //byEbru
        System.out.println(uni.stream().filter(t -> t.getNotOrtalamasi() > 63).map(t -> t.getÖgrenciSayisi()).reduce(0, (a, b) -> a + b));
    }

    //task 08--> Ogrenci sayisi 130'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void notOrtalamasiOrtalamasi(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 130).mapToDouble(t -> t.getNotOrtalamasi()).average());
        //mapToInt --> max()  min()  average()  sum()
        //mapToDouble --> max()  min()  average()  sum()
    }

    //task 09-->"matematik" bolumlerinin sayisini print ediniz.
    public static void matematikSayisi(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getBölüm().contains("Matematik")).count());
    }

    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz
    public static void enBüyükNotOrt(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() > 571).mapToInt(t -> t.getNotOrtalamasi()).max());
    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static void enKücükNotOrt(List<Üniversite> uni) {
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() < 1071).mapToInt(t -> t.getNotOrtalamasi()).min());
        System.out.println(uni.stream().filter(t -> t.getÖgrenciSayisi() < 1071).map(t -> t.getNotOrtalamasi()).reduce(Integer::min));
    }


}
