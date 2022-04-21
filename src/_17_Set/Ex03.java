package _17_Set;

import java.util.*;

public class Ex03 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */
    static List<Integer> liste = new ArrayList<Integer>();
    static List<Integer> tekrarsizListe = new ArrayList<Integer>();

    public static void main(String[] args) {


        int elemanSayisi = 30;
        Random rnd = new Random();

        for (int i = 0; i < elemanSayisi; i++) {
            int eleman = rnd.nextInt(10);
            liste.add(eleman);
        }
        System.out.println(liste);

        tekrarsiz(liste);
        seteCevir(liste);
    }



    private static void seteCevir(List<Integer> liste) {
        Set<Integer> setList = new HashSet<Integer>();
        setList.addAll(liste);
        System.out.println("Set list : " + setList);
        arrayListeCevir(setList);
    }

    private static void arrayListeCevir(Set<Integer> setList) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(setList);
        System.out.println("Array list : " + arrayList);
    }

    private static void tekrarsiz(List<Integer> liste) {

        for (int i = 0; i < liste.size(); i++) {
            if (!tekrarsizListe.contains(liste.get(i))) {
                tekrarsizListe.add(liste.get(i));
            }
        }
        System.out.println("Tekrarsiz : " + tekrarsizListe);
    }
}

