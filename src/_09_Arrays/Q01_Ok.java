package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Ok {

    /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz arrayin eleman sayisini giriniz");
        int input = scan.nextInt();
        int enKücük = 0;
        int enBüyük = 0;

        int arr[] = new int[input];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemanlari giriniz");
            int elemanlar = scan.nextInt();
            System.out.println(i + ".eleman : " + elemanlar);
            arr[i] = elemanlar;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        enBüyük = arr[arr.length - 1];
        enKücük = arr[0];
        System.out.println("En büyük eleman : " + enBüyük);
        System.out.println("En kücük eleman : " + enKücük);

        int fark = arr[arr.length - 1] - arr[0];
        System.out.println("En büyük ve en kücük eleman arasindaki fark : " + fark);


    }

}
