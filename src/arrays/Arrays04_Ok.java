package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays04_Ok {
    /*
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}
    output=60, 5
    */

    public static void main(String[] args) {

        int[] arr = {10, 13, 56, 20, 40, 60, 56, 32};
        List<Integer> arrList = new ArrayList<>(Arrays.asList(10, 13, 56, 20, 40, 60, 56, 32));
        System.out.println(arrList);

        int max = arrList.get(0);
        //int max = arr[0];

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        System.out.println("Max deger" + max + " ve " + (arrList.indexOf(max) + 1) + ". sirada bulunuyor");


    }

}
