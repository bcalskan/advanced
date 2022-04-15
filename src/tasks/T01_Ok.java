package tasks;

import java.util.Scanner;

public class T01_Ok {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        //  "\\p{Punct}" ---> noktalama



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String input = scan.nextLine();
//
//        System.out.println("Arr : " + Arrays.toString(arr));

        System.out.println(longestWord(input));


    }

    private static String longestWord(String input) {
        String[] arr = input.split(" ");
        int max = 0;
        String enUzunKelime = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > max) {
                max = arr[i].length();
                enUzunKelime = arr[i];
            }

        }

        return enUzunKelime;
    }
}
