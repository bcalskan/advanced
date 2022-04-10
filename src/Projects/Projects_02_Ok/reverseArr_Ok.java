package Projects.Projects_02_Ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reverseArr_Ok {
    /*
          Verilen String array
          String arrayi ters çevir
          ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] useThisArray = myStr.split(" ");

        //        code start here
        //        Koda burdan başlayın

        System.out.println("useThisArray    " + Arrays.toString(useThisArray));
        List<String> list = new ArrayList<String>();

        for (int i = useThisArray.length - 1; i >= 0; i--) {
            list.add(useThisArray[i]);
        }
        System.out.println(list);
    } //main

}









