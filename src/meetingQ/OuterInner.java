package meetingQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OuterInner {
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
        System.out.println("Array1 : " + Arrays.toString(array1)); //Array1 : [1, 2, 3]
        System.out.println("Array2 : " + Arrays.toString(array2)); //Array2 : [7, 3]

        boolean esitMi = true;

        if (array1[0] == (array2[0]) || array1[array1.length - 1] == (array2[array2.length - 1])) {
            System.out.println(esitMi);
        } else System.out.println(!esitMi);


    }//main
}

//inner.get(0) == outer.get(0) || (inner.get(inner.size() - 1) == outer.size() - 1)


//    List<Integer> inner = new ArrayList<Integer>();
//    List<Integer> outer = new ArrayList<Integer>();
//
//
//        for (int i = 0; i < array1.length; i++) {
//        inner.add(array1[i]);
//        }
//        System.out.println("Inner : " + inner);  //Inner : [1, 2, 3]
//
//
//        for (int j = 0; j < array2.length; j++) {
//        outer.add(array2[j]);
//        }
//        System.out.println("Outer : " + outer);  //Outer : [7, 3]