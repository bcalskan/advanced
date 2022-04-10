package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10_TekrarEt {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikElemanlariTopla(arr));
    }

    private static ArrayList ardisikElemanlariTopla(int[] arr) {
        List<Integer> toplananSayilarList = new ArrayList<Integer>();

        int sayac = 0;
        int toplananSayiAdet = 1;

        return (ArrayList) toplananSayilarList;
    }
}


//    private static ArrayList<Integer> ardisikTopla(int[] arr) {
//
//        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
//        int counter = 0;
//        int toplananSayiAdedi = 1;
//
//        while (arr.length - toplananSayiAdedi >= counter) { //sayilar bitene kadar
//            int toplam = 0;
//            for (int i = 0; i <= counter; i++) {
//                toplam += arr[toplananSayiAdedi - 1 + i];
//            }
//            counter++;
//            toplananSayiAdedi += counter;
//            toplananSayilarList.add(toplam);
//        }
//    return toplananSayilarList;
//    }



