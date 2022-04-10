package Projects.Projects_02_Ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates_Ok {
    /*
       Verilen int array
       duplicated(tekrarlanan) öğeleri array den kaldır
       non-duplicated(tekrarlanmayan) öğe sayisini print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
       //1 2 2 2 3 3 3 4 4 4 5 5 5
       result  5 olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for (int i = 0; i < useThisArray.length; i++) {
            int num = Integer.parseInt(arr[i]);
            useThisArray[i] = num;
        }

        // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
        //   useThisLine arrayini kullan

        System.out.println("useThisArray : " + Arrays.toString(useThisArray));
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(useThisArray[0]);

        for (int i = 0; i < useThisArray.length - 1; i++) { // 1 2 2 3 3 3 4 4 4 4
            if (!liste.contains(useThisArray[i])) {
                liste.add(useThisArray[i]);
            }
        }
        System.out.println("non-duplicated-list for useThisArray : " + liste);

        System.out.println("number of non-duplicated elements : " + liste.size());

    } //main
}
