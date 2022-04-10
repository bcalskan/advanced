package meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q16 {
    public static void main(String[] args) {

        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        OUTPUT : 100 98 96 94 92 … … … … 2 0
         */
        int sayi = 100;
        String output = "";

        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                //System.out.println(i + " ");
                if (i == sayi) {
                    output += i;
                } else {
                    output += i + " ";
                }
            }
        }

        List<String> list = new ArrayList<String>(Arrays.asList(output));
        System.out.println("Normal : " + list);
        Collections.reverse(list);

        System.out.println("Reverse : " + list);


    }
}
