package _17_Set;


import java.util.*;

public class HashSet02_Ok {
    public static void main(String[] args) {
/*
    İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
    HashSet, TreeSet ve linkedHashSet leri doldurun.
 */

        String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};

        cevirMethodu(arr);

    }

    private static void cevirMethodu(String[] arr) {
        List<String> list = new ArrayList<>();
        for (String each : arr) {
            list.add(each);
        }
        System.out.println("List : " + list);

        HashSet<String> hashList = new HashSet<>();
        hashList.addAll(list);
        System.out.println("HashList : " + hashList);

        TreeSet<String> treeList = new TreeSet<>();
        treeList.addAll(list);
        System.out.println("TreeList : " + treeList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        System.out.println("LinkedList : " + linkedList);
    }


}
