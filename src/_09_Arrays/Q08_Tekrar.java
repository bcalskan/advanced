package _09_Arrays;

import java.util.Arrays;

public class Q08_Tekrar {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String eleman[] = str.split(" ");
        System.out.println(Arrays.toString(eleman)); //[$1, $23, $134, $2, $7, $24, £32, £40, £2, £65, £4]

        int usdToplam = 0;
        int euroToplam = 0;

        for (int i = 0; i < eleman.length; i++) {
            if (eleman[i].contains("$")) {
                usdToplam += Integer.valueOf(eleman[i].replace("$", ""));
            } else {
                euroToplam += Integer.valueOf(eleman[i].replace("£", ""));
            }
        }
        System.out.println("$´lerin toplami : " + usdToplam);
        System.out.println("£´lerin toplami : " + euroToplam);


    }
}


