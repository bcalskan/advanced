package Projects.Projects_03;

import java.util.Scanner;

public class ThreeEvenOdd {
    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 5};
        int tekSay = 0;
        int ciftSay = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                tekSay++;
            }else ciftSay++;
        }

        if (tekSay==3 || ciftSay==3) System.out.println(true);
        else System.out.println(false);
    }

}
