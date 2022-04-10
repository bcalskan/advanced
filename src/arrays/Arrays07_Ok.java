package arrays;

import java.util.Arrays;

public class Arrays07_Ok {
    /*
       Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
       boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
       siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. siradadir ve boy esitligi dikkate alinmamistir°
       input={170,180,167,165,175,190,169,172,187,178,175}
       Alinin boyu 175
       output=Ali 5.siradadir
        */
    public static void main(String[] args) {

        int[] arr = {170, 180, 167, 165, 175, 190, 169, 172, 187, 178, 175};
        int[] arrTers = new int[arr.length];
        int sira = 0;

        Arrays.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr)); //Sorted : [165, 167, 169, 170, 172, 175, 175, 178, 180, 187, 190]

        for (int i = arr.length - 1; i >= 0; i--) {
            arrTers[i] = arr[arr.length - i - 1];
        }
        System.out.println("Arr Ters : " + Arrays.toString(arrTers)); //[190, 187, 180, 178, 175, 175, 172, 170, 169, 167, 165]

        int i = 0;
        while (arr[i] != 175) {
            sira++;
            i++;
        }

        System.out.println("Ali " + sira + ". siradadir.");


    }
}
