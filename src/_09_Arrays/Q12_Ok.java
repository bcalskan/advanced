package _09_Arrays;

import java.util.Arrays;

public class Q12_Ok {

    public static void main(String[] args) {
        //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
        //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
        // ve yeni array’i ekrana yazdıran bir program yazınız
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int toplam = 0;

        int arrToplam[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            arrToplam[i] = toplam;
            toplam = 0;
        }

        System.out.println("New : " + Arrays.toString(arrToplam));

    }
}
