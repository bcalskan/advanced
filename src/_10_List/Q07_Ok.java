package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class Q07_Ok {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr1[] = {1, 2, 3, 4, 4,3, 2, 1};

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        List<Integer> ilkYarisi = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            ilkYarisi.add(list.get(i));
        }
        System.out.println("Ilk yarisi : " + ilkYarisi);  //Ilk yarisi : [1, 2, 3, 4]


        List<Integer> ikinciYarisi = new ArrayList<Integer>();
        for (int i = (list.size() / 2); i < list.size(); i++) {
            ikinciYarisi.add(list.get(i));
        }
        System.out.println("Ikinci yarisi : " + ikinciYarisi); //Ikinci yarisi : [4, 3, 2, 1]



        Collections.reverse(ikinciYarisi);
        System.out.println("Ikinci yarisi reverse edilmis hali : " + ikinciYarisi); //[1, 2, 3, 4]



        if (ilkYarisi.equals(ikinciYarisi)) {
            System.out.println("Girilen array simetriktir");
        } else {
            System.out.println("Girilen array simetrik degildir");
        }
    }
}
