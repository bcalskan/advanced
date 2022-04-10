package meetingQ;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //asagidaki bilgileri dikkate alarak ilgili java kodunu yaziniz
        //String sinifindan str1 ve str2 adinda olan iki tane nesne create
        //olustuurlan stringlerin uzunluklari ve uzun olan stringi konsol ekraninda yaziniz
        //son olarak str1i str2ye, str2yi str1e atayiniz. swap islemi

        Scanner scan = new Scanner(System.in);
        System.out.println("1.ifadeyi giriniz");
        String str1 = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("1.ifadeyi giriniz");
        String str2 = scan.next();

        if (str1.trim().length() > str2.trim().length()) {
            System.out.println("En uzun kelime uzunlugu : " + str1);

        } else if (str2.trim().length() > str1.trim().length()) {
            System.out.println("En uzun elime uzunlugu : " + str2);
        } else {
            System.out.println("Iki ifade birbirine esit");
        }

        System.out.println("Swap öncesi str1 : " +str1 + " "+ " Swap öncesi str1 "+str2);
        String container = str1;
        str1 = str2;
        str2 = container;

        System.out.println("Swap sonrasi Str1 : " + str1 + " " + "Swap sonrasi Str 2 : " + str2);


    }
}
