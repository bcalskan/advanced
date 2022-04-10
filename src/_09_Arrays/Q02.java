package _09_Arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */

        int input[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
        int arr[] = new int[input.length];
        System.out.println(Arrays.toString(arr));

        int toplam1 = 0;
        int toplam2 = 0;
        int toplam3 = 0;

        for (int i = 0; i < input.length; i++) {
            toplam1 += input[0][i];
        }
        System.out.println("0.boyutun toplami : " + toplam1);

        for (int j = 0; j < input[1].length; j++) {
            toplam2 += input[1][j];
        }
        System.out.println("1.boyutun toplami : " + toplam2);

        for (int k = 0; k < input[2].length; k++) {
            toplam3 += input[2][k];
        }
        System.out.println("2.boyutun toplami : " + toplam3);

        arr[0] = toplam1;
        arr[1] = toplam2;
        arr[2] = toplam3;

        System.out.println(Arrays.toString(arr));


    }
}
