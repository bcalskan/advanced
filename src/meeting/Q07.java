package meeting;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {


         /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

   Örnek:
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

        int[] arr2 = {1, 6, 12, 15, 22, 18, 30, 16};
        int sayi1 = 10, sayi2 = 20;

        URange(arr2, sayi1, sayi2);
    }

    private static int[] URange(int[] arr2, int sayi1, int sayi2) {

        System.out.println(Arrays.toString(arr2));

        for (int i = arr2.length - 1; i >= 0; i--)
            if (arr2[i] > 10 && arr2[i] < 20)
                arr2[i] = -1;
        System.out.println(Arrays.toString(arr2));

        return arr2;

    }
}
