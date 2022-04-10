package Projects.Projects_02_Ok;

import java.util.Arrays;
import java.util.Scanner;

public class sameFirstAndLast_Ok {
    /*
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] useThisArray = myStr.split("");

        //  code start here
        // Koda burdan başlayin

        System.out.println("useThisArray : " + Arrays.toString(useThisArray));

        boolean dogruMu = true;

        if (useThisArray.length >= 1 && useThisArray[0].equals(useThisArray[useThisArray.length - 1])) {
            System.out.println(dogruMu);
        } else System.out.println(!dogruMu);


    }


}
