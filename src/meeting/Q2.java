package meeting;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Kac elemanli array olusturmak istiyorsunuz : ");

        int elemanSayisi = scan.nextInt();
        int[] myArr = new int[elemanSayisi];
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < myArr.length; i++) {
            System.out.print((i + 1) + ". elemani giriniz : ");
            int elemanlar = scan.nextInt();
            list.add(elemanlar);
        }

        System.out.println("myArr--> : " + list);

        System.out.println("Listeyi ikiye bölünüz");

        System.out.print("Kacinci elemandan itibaren ikinci liste olusturulmali ? :");
        int böl = scan.nextInt();

        List<Integer> inner = new ArrayList<Integer>();
        List<Integer> outer = new ArrayList<Integer>();

        for (int i = 0; i < böl; i++) {
            inner.add(list.get(i));
        }
        System.out.println("Inner list : " + inner);

        for (int i = böl; i < list.size(); i++) {
            outer.add(list.get(i));
        }
        System.out.println("Outer list : " + outer);

        boolean esitMi = true;
        if (inner.get(0) == outer.get(0) || inner.get(inner.size() - 1) == outer.get(inner.size() - 1)) {
            System.out.println(esitMi);
        } else System.out.println(!esitMi);


    }
}
