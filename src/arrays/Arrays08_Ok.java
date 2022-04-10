package arrays;

public class Arrays08_Ok {
    /*
    Bir dersten ogrencilerin aldigi notlar,tamsayi dizisi olarak veriliyor

    En yuksek notu kac ogrenci almisitr
    input={95,70,80,90,65,75,95,47,73,56,72,95}
    output=3
      */
    public static void main(String[] args) {

        int[] notlar = {95, 70, 80, 90, 65, 75, 95, 47, 73, 56, 72, 95};
        int max = 0;
        int sayac = 0;

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] > max) {
                max = notlar[i];
            }
        }

        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] == max) {
                sayac++;
            }
        }

        System.out.println("Maksimum not : " + max + " ve " + sayac + " defa alinmistir.");


    }

}
