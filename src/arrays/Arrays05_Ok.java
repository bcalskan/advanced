package arrays;

import java.util.Arrays;

public class Arrays05_Ok {
    //verilen bir tamsayi dizisinin en buyuk ve en kucuk elemanlarini bulup yer degistirn
    //input= {10,13,56,20,40,60,56,32}

    public static void main(String[] args) {

        int arr[] = {10, 13, 56, 20, 40, 60, 56, 32};
        Arrays.sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr)); //[10, 13, 20, 32, 40, 56, 56, 60]

        int container = 0;
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Min : " + min + "\nMax : " + max); //Min 10  ---- Min 60


        container = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = container;
        System.out.println("Yer degistirilmis hali : " + Arrays.toString(arr));


    }
}


