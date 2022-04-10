package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_Ok {

    static Scanner scan = new Scanner(System.in);
    static List<Integer> liste = new ArrayList<Integer>();
    static List<Integer> tekElemanListe = new ArrayList<Integer>();


    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
        yazdırınız.
       */

        int[] arr = new int[6];
        List<Integer> liste = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lütfen " + (i + 1) + ". elemani giriniz :");
            int elemanlar = scan.nextInt();
            liste.add(elemanlar);
        }
        System.out.println("Liste : " + liste);

        tekElemanAta(arr, liste);

    }

    private static void tekElemanAta(int[] arr, List<Integer> liste) {

        List<Integer> tekElemanListe = new ArrayList<Integer>();

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) % 2 != 0) {
                tekElemanListe.add(liste.get(i));
            }
        }
        System.out.println("Tek elemanlar : " + tekElemanListe);
    }

}
