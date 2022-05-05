package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int carp = 2;
        int sayi1 = 15;
        int sayi3 = 15;
        int sayi4 = 15;
        int sayi5 = 15;

        toplaCarp(carp,sayi1,sayi3,sayi4,sayi5);
    }

    private static void toplaCarp(int carp, int... s) {
        int toplam = 0;

        for (Integer each : s) {
            toplam += each;
        }

        System.out.println(toplam*carp);
    }


}
