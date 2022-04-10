package arrays;

import java.util.Arrays;

public class Arrays06 {
    //verilen bir tam syai dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilarin
    //toplamini bulunuz

    //input={10,13,56,20,40,60,56,32}
    //output=13+56+20+40
    public static void main(String[] args) {

        int arr[] = {10, 13, 56, 20, 40, 60, 56, 32};
        int sum = 0;
        int max = arr[0];
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max + " " + min);




    }
}
