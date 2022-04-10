package Projects.Projects_02_Ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class changeArray_Ok {
    /*
       String bir array verildiğinde
       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:
       Array : Peach , Berry , Orange , WaterMelon , Orange
       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
       Arrayi print edin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

//        Koda burdan başla
//        kullanman gereken -> UseThisArray

        List<String> list = new ArrayList<String>(Arrays.asList(UseThisArray));
        System.out.println("List : " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Orange")) {
                list.set(list.indexOf(list.get(i)), "Apple");
            }
        }
        System.out.println("After swap : " + list);

    } //main
}