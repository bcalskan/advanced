package _12_Varargs;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String str1 = "m";
        String str2 = "e";
        String str3 = "r";
        String str4 = "v";
        String str5 = "e";

        concatMethod(str1, str2, str3, str4, str5);

    }

    private static void concatMethod(String... s) {
        String str = "";

        for (String each : s) {
            str += each;
        }
        System.out.println(str);
    }


}

