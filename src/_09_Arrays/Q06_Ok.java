package _09_Arrays;

import java.util.Arrays;

public class Q06_Ok {
    public static void main(String[] args) {
	
	/*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	*/

        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1, -90};
        int enBüyük = 0;
        int enKücük = 0;
        int enBüyükIkinci = 0;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[-90, -90, 0, 1, 100, 845, 898, 8787, 10001]

        for (int i = 0; i < arr.length; i++); {
            enBüyük = arr[arr.length-1];
            enBüyükIkinci = arr[arr.length-2];
            enKücük = arr[0];

        }

        System.out.println("En büyük sayi : " +enBüyük);
        System.out.println("En kücük sayi : " +enKücük);
        System.out.println("En büyük ikinci deger : " +enBüyükIkinci);
    }
}
