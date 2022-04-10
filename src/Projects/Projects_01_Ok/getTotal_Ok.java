package Projects.Projects_01_Ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class getTotal_Ok {
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

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allElements = scanner.nextLine();
        String[] elements = allElements.split(" "); // 10 20 30
        String num1 = elements[0];
        String num2 = elements[1];
        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın


        List<String> list = new ArrayList<>(Arrays.asList(allElements.split(" ")));
        System.out.println("List : " + list);
        List<Integer> list2 = new ArrayList<>();

        int toplam = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].contains("-")) {
                elements[i] = list.get(i).replaceAll("\\D", "");
                list2.add(Math.abs(Integer.parseInt(elements[i])));
                toplam += list2.get(i);
            } else {
                elements[i] = list.get(i).replaceAll("\\D", "").trim();
                list2.add(Integer.parseInt(elements[i]));
                toplam += list2.get(i);
            }
        }
        System.out.println("Toplam : " + toplam);
    }
}