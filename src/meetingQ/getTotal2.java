package meetingQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class getTotal2 {
    public static void main(String[] args) {
        /*
    3 tane pozitif String verildiğinde
    sayısal olmayan tüm karakterleri kaldırın.
    Stringleri int e çevirin
    ve total print edin
        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65; olmali


       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir  // "%-15"
        */

        Scanner scanner = new Scanner(System.in);
        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];
        String num2 = elements[1];
        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın

        List<String> list = new ArrayList<String>(Arrays.asList(allElements.split(" ")));
        System.out.println("Girilen elemanlar liste hali : " + list); //Girilen elemanlar liste hali : [$15, $15, $15]


        List<Integer> list2 = new ArrayList<Integer>(); // sayisal olmayan degerleri kaldirdiktan sonra atama yaptik.

        int toplam = 0;

        int i = 0;
        do {
            elements[i] = elements[i].replaceAll("[%$§A-Za-z]", "");  // "$15" ----> "15"
            list2.add(Integer.parseInt(elements[i])); //15
            toplam += list2.get(i); //15 20 25
            i++;

        } while (i < elements.length);  // i<3


        System.out.println("Sayisal olmayan degerlerin kaldirilmis hali : " + list2); //Sayisal olmayan degerlerin kaldirilmis hali : [15, 15, 15]

        if (toplam < 0) {
            System.out.println("-1");
        } else System.out.println("Toplam : " + toplam);


    }
}
