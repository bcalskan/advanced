package Projects.Projects_02_Ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Common2Arrays_Ok {
    /*
        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] array1 = new int[3];
        int[] array2 = new int[2];

        for (int i = 0; i < 3; i++) {
            array1[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            array2[i - 3] = myArr[i];
        }
        /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan
        */

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            list1.add(array1[i]);
        }
        System.out.println("List1 : " + list1);

        for (int j = 0; j < array2.length; j++) {
            list2.add(array2[j]);
        }
        System.out.println("List2 : " + list2);

        boolean esitMi = true;

        if (list1.get(0) == list2.get(0) || list1.get(list1.size() - 1) == list2.size() - 1) {
            System.out.println(esitMi);
        } else System.out.println(!esitMi);


    }

}
