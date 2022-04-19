package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
parametresi Integer set ve integer array ve adi elementEkle
olan array elemanalrı set'e convert edn bir method create ediniz .
yine set icindekileri yazdiracak ayrica bir method daha create edip print ediniz.
 */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 6, 5, 7, 8, 0, 2, 6};
        Set<Integer> set1 = new HashSet<Integer>();
        elementEkle(arr, set1);


    }

    private static void elementEkle(int[] arr, Set<Integer> set1) {
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }
        setYazdir(set1);
    }

    private static void setYazdir(Set<Integer> set1) {
        System.out.println("Set1 : " + set1);
    }
}
