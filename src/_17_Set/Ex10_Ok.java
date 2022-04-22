package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex10_Ok {

    public static void main(String[] args) {

        // Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden
        // olusan bir liste haline getiren bir program yaziniz.

        int arr[] = {1, 2, 3, 4, 4, 5, 7, 3, 4};
        Set<Integer> tekrarsizArray = tekrarlariSil(arr);
        System.out.println(tekrarsizArray);
    }

    private static Set<Integer> tekrarlariSil(int[] arr) {
        Set<Integer> setList = new HashSet<Integer>();
        for (Integer each : arr) {
            setList.add(each);
        }
        return setList;
    }


}
