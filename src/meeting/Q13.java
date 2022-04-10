package meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        /*
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    sadece  true veya false print et
    */
        Scanner scan = new Scanner(System.in);
        System.out.println(" 4 sayi giriniz :");
        String myStr = scan.nextLine();
        String[] useThisArray = myStr.split("");

        //  code start here
        // Koda burdan başlayin

        int[] myArr = new int[4];
        System.out.println(Arrays.toString(useThisArray));

        for (int i = 0; i < useThisArray.length; i++) {
            int sayi = Integer.parseInt(useThisArray[i]);
            myArr[i] = sayi;
        }

        System.out.println("myArr " + Arrays.toString(myArr));
        int[] UseThisArray = new int[4];
        for (int i = 0; i < useThisArray.length; i++) {
        }

        System.out.println("Usethisarray :" + Arrays.toString(useThisArray));
        List<Integer> outer = new ArrayList<>();
        outer.add(UseThisArray[0]);
        outer.add(UseThisArray[1]);
        outer.add(UseThisArray[2]);
        outer.add(UseThisArray[3]);
        System.out.println("outer " + outer);
        if (useThisArray[0].equals(useThisArray[useThisArray.length - 1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
