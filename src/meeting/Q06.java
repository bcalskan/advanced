package meeting;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int eklenecekSayi = 5;

        int[] arrYeni = new int[arr.length + 1];
        System.out.println(Arrays.toString(arrYeni)); //[0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            arrYeni[i] = arr[i];
            arrYeni[arrYeni.length - 1] = eklenecekSayi;
        }

        System.out.println(Arrays.toString(arrYeni)); //[0, 0, 0, 0, 0]


    }
}
