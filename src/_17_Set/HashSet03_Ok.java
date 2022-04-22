package _17_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet03_Ok {
    /*

	 		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
	    	Cevap: TreeSet

	 		Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	    Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
	 	    Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
     */
    public static void main(String[] args) {

        int arr[] = {1, 5, 6, 8, 5, 6, 4, 8, 6, 6, 7, 6, 2, 3, 6, 4, 6};
        HashSet<Integer> hashList = new HashSet<Integer>();

        for (Integer each : arr) {
            hashList.add(each);
        }
        System.out.println("HashList : " + hashList);
        TreeSet<Integer> treeList = new TreeSet<Integer>();
        treeList.addAll(hashList);
        System.out.println("TreeList : " + treeList);


    }
}
