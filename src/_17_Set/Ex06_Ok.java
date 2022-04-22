package _17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex06_Ok {
    static HashSet<Integer> setlist = new HashSet<Integer>();

    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        // 1 den 20 e kadar olan sayılarla doldurup yazdırın
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.

        Random rnd = new Random();

        do {
            int eleman = rnd.nextInt(20);
            setlist.add(eleman);

        } while (setlist.size() < 10);
        System.out.println(setlist);


        int[] arr = new int[10];
        Iterator itr = setlist.iterator();
        for (int i = 0; i < setlist.size(); i++) {
            arr[i] = (int) itr.next();
        }
        System.out.println("Array : " + Arrays.toString(arr));


    }
}
