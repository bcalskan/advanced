package arrays;


public class Arrays14_Ok {
    /*
        Bir sinifta bir derse ait notlar veriliyor, sinifin not ortalamsindaki
        ve daha yuksek not alan ogrenciler basarili sayiliyor, kac kisinin basarili oldgunu bulan kod yazdiriniz

        input={100,70,80,70,20,30,50,50,65,55,57}
        output
        ortalamayai bulan ve asan ogrenci sayisi:
   */
    public static void main(String[] args) {

        int arr[] = {100, 70, 80, 70, 20, 30, 50, 50, 65, 55, 57};
        double ortalama = 0;
        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        ortalama = toplam / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                sayac++;
            }
        }
        System.out.println("Ortalama : " + ortalama);
        System.out.println(sayac + " kisi basarilidir.");


    }


}
