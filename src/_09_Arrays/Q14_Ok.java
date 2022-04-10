package _09_Arrays;

import java.util.Arrays;

public class Q14_Ok {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */

        String kelime = "Congratulations";
        String[] arr = kelime.split("");
        System.out.println("Arr : " + Arrays.toString(arr));

        String arrTersten = "";


        for (int i = arr.length - 1; i >= 0; i--) {
            arrTersten += arr[i];

        }
        System.out.println("arrTersten : " + arrTersten);

        arrTersten = arrTersten.replaceAll("o", "i");
        arrTersten = arrTersten.replaceAll("a", "i");
        arrTersten = arrTersten.replaceAll("u", "i");

        System.out.println(arrTersten);


    }


}


