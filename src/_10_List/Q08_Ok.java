package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_Ok {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        List<String> input = new ArrayList<String>(Arrays.asList("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));

        System.out.println("Swap öncesi : " + input); //Swap öncesi : [Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
        System.out.println(input.get(2)); //Kemal
        System.out.println(input.get(7)); //Furkan

        String container = isimler[2];
        System.out.println("Container : " + container); //Kemal

        isimler[2] = isimler[7];
        System.out.println("2 : " + isimler[2]);//Furkan
        isimler[7] = container;
        System.out.println("7 : " + isimler[7]); //Kemal

        System.out.println(Arrays.toString(isimler)); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]

        input.clear();
        for (int i = 0; i <isimler.length ; i++) {
            input.add(isimler[i]);
        }
        System.out.println("Swap sonrasi : " + input); //[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]


    }

}
