package arrays;

import java.util.Arrays;

public class Arrays03_Ok {
        /*
             verilen bir metnin tum kelimelerinin ilk harflerin buyuk
             digerleri kucuk olacak sekilde duzenleyin
             ornek input=>
             "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI"
         */

    public static void main(String[] args) {
        String str = "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI";
        String str2 = "";
        String[] input = str.toLowerCase().split(" ");
        String[] input2 = new String[input.length];

        System.out.println("input-arr :" + Arrays.toString(input));

        for (int i = 0; i < input.length; i++) {
            str2 += input[i].substring(0, 1).toUpperCase() + input[i].substring(1) + " ";

        }
        input2 = str2.split(" ");

        System.out.println(str2);
        System.out.println(Arrays.toString(input2));


    }


}
