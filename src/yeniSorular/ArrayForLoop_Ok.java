package yeniSorular;

public class ArrayForLoop_Ok {
    /*
        A ve B sinifina ait matematik notlari 2 ayri liste halinde verilmistir(Tam sayi olarak). Hangi sinif daha basarilidir?
        (basari kriteri siniftaki tum ogrencilerin notlarinin ortalamasinin diger
        sinif ortalamasinda yuksek olmasidir.

      girdi
      'A' integar dizisi
      'B' integar dizisi
      output
      Daha basarili sinifin adi:"A" veya "B"
      Not=Iki dizinin uzunlugu ayni oldugu icin ayni loop icinde ortalamalarini alin

//A sinifinin ortalamasini bul
//B sinifinin ortalamasini bul
//Buyuk olani ekrana yazdir

         */
    public static void main(String[] args) {

        int sinifA[] = {45, 84, 75, 96, 33, 57};
        int sinifB[] = {76, 62, 41, 27, 100, 95};

        int toplamA = 0;
        int toplamB = 0;

        double ortA = 0;
        double ortB = 0;

        for (int i = 0; i < sinifA.length; i++) {
            toplamA += sinifA[i];
            toplamB += sinifB[i];
        }

        ortA = toplamA / sinifA.length;
        ortB = toplamB / sinifA.length;

        System.out.println("A sinifinin ortalamasi : " + ortA);
        System.out.println("B sinifinin ortalamasi : " + ortB);

        if (ortA > ortB) {
            System.out.println("A sinifinin ortalamasi B sinifindan daha yüksektir.");
        } else if (ortA == ortB) {
            System.out.println("Siniflarin ortalamalari esittir.");
        } else System.out.println("B sinifinin ortalamasi A sinifindan daha yüksektir.");


    }
}


//    int arrA[] = {20, 35, 40, 80};
//    int arrB[] = {40, 70, 90, 82};
//
//    List<Integer> classA = new ArrayList<>(Arrays.asList(20, 35, 40, 80));
//    List<Integer> classB = new ArrayList<>(Arrays.asList(40, 70, 90, 82));
//    int toplamA = 0;
//    int toplamAort = 0;
//    int toplamB = 0;
//    int toplamBort = 0;
//        for (int i = 0; i < classA.size(); i++) {
//        toplamA += classA.get(i);
//        toplamB += classB.get(i);
//        toplamAort=toplamA/classA.size();
//        toplamBort=toplamB/classB.size();
//
//        }
//        if (toplamAort>toplamBort){
//        System.out.println("A sinifi daha basarili");
//        }else System.out.println("B sinifi daha basarili");
//
//        System.out.println("toplam A : " +"="+ toplamA+"**************"+"toplam B :"+toplamB);
//        }

